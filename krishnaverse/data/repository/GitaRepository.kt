package com.example.krishnaverse.data.repository

import android.content.Context
import com.example.krishnaverse.data.model.GitaVerse
import com.example.krishnaverse.data.util.JsonLoader

class GitaRepository(private val context: Context) {
    private val verses: List<GitaVerse> =
        JsonLoader.loadGitaVerses(context)

    private var lastShown: GitaVerse? = null

    private val strongKeywords = setOf(
        "rape", "abuse", "assault",
        "death", "died", "passed away",
        "suicide", "hopeless"
    )
    private val intentKeywordMap = mapOf(
        // Grief & Loss
        "grief" to listOf("grief", "lost", "loss", "cry", "tears", "missing"),
        "death" to listOf("death", "died", "passed away", "gone forever"),
        "loss" to listOf("lost someone", "separation"),

        // Trauma & Abuse
        "trauma" to listOf("abuse", "rape", "assault", "violated", "trauma"),
        "dignity" to listOf("worth", "respect", "dignity"),
        "self_worth" to listOf("worthless", "broken", "shame", "guilt"),

        // Suffering & Healing
        "suffering" to listOf("suffering", "pain", "hurt", "why me"),
        "healing" to listOf("healing", "recover", "recovering"),
        "hope" to listOf("hope", "light", "it will pass"),

        // Fear, Stress, Anger
        "fear" to listOf("fear", "scared", "afraid", "panic"),
        "stress" to listOf("stress", "pressure", "overwhelmed"),
        "anger" to listOf("anger", "angry", "rage", "hate"),

        // Peace & Balance
        "peace" to listOf("peace", "calm", "quiet"),
        "balance" to listOf("balance", "steady", "stable"),
        "emotional_control" to listOf("emotions", "control feelings"),

        // Confidence & Strength
        "confidence" to listOf("confidence", "self belief", "doubt"),
        "strength" to listOf("strong", "strength", "courage"),

        // Wisdom & Clarity
        "wisdom" to listOf("wisdom", "understand", "knowledge"),
        "clarity" to listOf("clarity", "clear", "understand"),
        "confusion" to listOf("confused", "lost", "uncertain"),

        // Action & Duty
        "action" to listOf("action", "act", "doing"),
        "duty" to listOf("duty", "responsibility"),
        "decision" to listOf("decision", "choose", "choice"),

        // Discipline & Control
        "discipline" to listOf("discipline", "control"),
        "self_control" to listOf("self control", "control mind"),
        "practice" to listOf("practice", "daily effort"),

        // Attachment & Desire
        "attachment" to listOf("attachment", "cling"),
        "desire" to listOf("desire", "craving", "want"),

        // Growth & Patience
        "growth" to listOf("growth", "improve", "change"),
        "patience" to listOf("patience", "wait"),

        // Faith & Surrender
        "faith" to listOf("faith", "believe", "trust god"),
        "trust" to listOf("trust", "rely"),
        "surrender" to listOf("surrender", "let go"),

        // Compassion & Kindness
        "compassion" to listOf("compassion", "kindness", "care"),
        "kindness" to listOf("kind", "gentle"),

        // Values & Character
        "humility" to listOf("humble", "ego less"),
        "ego" to listOf("ego", "pride"),

        // Awareness & Focus
        "awareness" to listOf("aware", "mindful"),
        "focus" to listOf("focus", "concentrate"),
        "purpose" to listOf("purpose", "meaning"),

        // Service & Giving
        "service" to listOf("serve", "help others"),
        "giving" to listOf("give", "donate"),

        // Social / Speech
        "speech" to listOf("speak", "words", "talk"),
        "responsibility" to listOf("responsibility", "role")
    )
    fun getTopCandidates(userInput: String): List<GitaVerse> {
        val input = userInput
            .lowercase()
            .replace(Regex("[^a-z ]"), " ")
            .replace(Regex("\\s+"), " ")
            .trim()

        val scoredVerses = verses.map { verse ->
            var score = 0
            var matchCount = 0

            verse.tags?.forEach { tag ->
                intentKeywordMap[tag.lowercase()]?.forEach { keyword ->
                    if (input.contains(keyword)) {
                        matchCount++
                        score += if (strongKeywords.contains(keyword)) 6 else 3
                    }
                }
            }
            if (matchCount >= 2) score += 4 // context bonus
            verse to score
        }

        return scoredVerses
            .filter { it.second >= 3 }
            .sortedByDescending { it.second }
            .take(5)
            .map { it.first }
    }
    fun getResponse(userInput: String): GitaVerse {
        return getTopCandidates(userInput).randomOrNull()
            ?: verses.shuffled().first()
    }
}
