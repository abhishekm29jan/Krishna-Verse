package com.example.krishnaverse.data.model

data class GitaVerse(
    val chapter: Int,
    val verse: Int,
    val sanskrit: String,
    val meaning: String,
    val explanation: String,
    val tags: List<String>
)
