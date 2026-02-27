package com.example.dailydo.data.repository

import com.example.dailydo.domain.model.Article
import kotlinx.coroutines.flow.Flow

interface NewsRepository {
    fun getArticles(): Flow<List<Article>>
    suspend fun refreshArticles(apiKey: String)
}