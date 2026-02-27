package com.example.dailydo.domain.model

data class Article(
    val id: Long = 0,

    val url: String,
    val title: String,
    val description: String?,
    val imageUrl: String?,
    val sourceName: String,
    val publishedAt: Long,
    val category: String? = null,
)