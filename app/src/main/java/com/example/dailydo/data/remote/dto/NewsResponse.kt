package com.example.dailydo.data.remote.dto

import com.example.dailydo.data.local.dao.ArticleDao

data class NewsResponse (val status: String,
    val totalResult: Int,
    val articles: List<ArticleDto>
)
data class ArticleDto(
     val url: String,
    val title: String,
    val description: String?,
    val imageUrl: String?,
    val sourceName: String,
    val publishedAt: Long,
    val category: String? = null,
)

