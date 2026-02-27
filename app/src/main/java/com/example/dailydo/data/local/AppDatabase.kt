package com.example.dailydo.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.dailydo.data.local.dao.ArticleDao
import com.example.dailydo.data.local.dao.TodoDao
import com.example.dailydo.data.local.entity.ArticleEntity
import com.example.dailydo.data.local.entity.TodoEntity

@Database(
    entities = [TodoEntity::class, ArticleEntity::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun todoDao(): TodoDao
    abstract fun articleDao(): ArticleDao

}