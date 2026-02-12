package com.example.krishnaverse.data.util

import android.content.Context
import com.example.krishnaverse.data.model.GitaVerse
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

object JsonLoader {

    fun loadGitaVerses(context: Context): List<GitaVerse> {
        val jsonString = context.assets
            .open("gita_chatbot.json")
            .bufferedReader()
            .use { it.readText() }

        val listType = object : TypeToken<List<GitaVerse>>() {}.type
        return Gson().fromJson(jsonString, listType)
    }
}
