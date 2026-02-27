package com.example.dailydo.data.mapper

import com.example.dailydo.data.local.entity.ArticleEntity
import com.example.dailydo.data.remote.dto.ArticleDto
import com.example.dailydo.domain.model.Article


fun ArticleEntity.toDomain() = Article(
    url = url,
    title = title,
    description = description,
    imageUrl = imageUrl,
    sourceName = sourceName,
    publishedAt = publishedAt,
    category = category
)

fun ArticleDto.toEntity() = ArticleEntity(
    url = url,
    title = title,
    description = description,
    imageUrl = imageUrl,
    sourceName = sourceName,
    publishedAt = publishedAt,
    category = category
)