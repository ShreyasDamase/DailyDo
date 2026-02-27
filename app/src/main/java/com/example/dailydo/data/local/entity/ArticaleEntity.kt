package com.example.dailydo.data.local.entity

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.example.dailydo.data.remote.dto.ArticleDto
import com.example.dailydo.domain.model.Article


@Entity(
    tableName = "articles",
    indices = [Index(value = ["url"], unique = true)]
)
data class ArticleEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,

    val url: String,
    val title: String,
    val description: String?,
    val imageUrl: String?,
    val sourceName: String,
    val publishedAt: Long,
    val category: String? = null,
    val isBookmarked: Boolean = false,
    val cachedAt: Long = System.currentTimeMillis()
)

