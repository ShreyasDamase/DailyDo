package com.example.dailydo.data.repository

import com.example.dailydo.data.local.dao.ArticleDao
import com.example.dailydo.data.mapper.toEntity
import com.example.dailydo.data.remote.NewsApiService
import com.example.dailydo.domain.model.Article
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import com.example.dailydo.data.mapper.toDomain

class NewsRepositoryImpl(
    private val newsApiService: NewsApiService,
    private val articleDao: ArticleDao
) : NewsRepository {
    override fun getArticles(): Flow<List<Article>> {
        return articleDao.getAllArticles().map { entities ->
            entities.map { it.toDomain() }
        }
    }

    override suspend fun refreshArticles(apiKey: String) {
        val response = newsApiService.getTopHeadlines(apiKey = apiKey)
        articleDao.clearAll()
        articleDao.insertArticles(response.articles.map { it.toEntity() })
    }
}