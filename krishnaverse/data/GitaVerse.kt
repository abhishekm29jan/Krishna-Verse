package com.example.krishnaverse.data

data class GitaVerse(
    val chapter: Int,
    val verse: Int,
    val explanation: String,
    val sanskrit: String? = null,
    val meaning: String? = null,
    val tags: List<String>? = null
)

