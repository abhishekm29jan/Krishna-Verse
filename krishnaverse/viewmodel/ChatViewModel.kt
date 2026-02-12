package com.example.krishnaverse.viewmodel

import android.app.Application
import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.krishnaverse.data.repository.GitaRepository
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class ChatViewModel(application: Application) : AndroidViewModel(application) {

    private val repository = GitaRepository(getApplication())


    val messages = mutableStateListOf<Pair<Boolean, String>>()

    private val usedVerses = mutableSetOf<Pair<Int, Int>>() // session memory

    fun sendMessage(userText: String) {
        messages.add(true to userText)

        viewModelScope.launch {
            delay(700)

            val candidates = repository.getTopCandidates(userText)

            val fresh = candidates.filter {
                !usedVerses.contains(it.chapter to it.verse)
            }

            val selected = when {
                fresh.isNotEmpty() -> fresh.random()
                candidates.isNotEmpty() -> candidates.random()
                else -> repository.getResponse(userText)
            }

            usedVerses.add(selected.chapter to selected.verse)

            val reply = """
                Krishna says to you, My Dear,
                ${selected.explanation}

                (Bhagavad Gita – Chapter ${selected.chapter}, Verse ${selected.verse})
            """.trimIndent()

            messages.add(false to reply)
        }
    }
}

