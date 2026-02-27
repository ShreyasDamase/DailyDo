package com.example.dailydo.di

import android.content.Context
import androidx.room.Room
import com.example.dailydo.data.local.AppDatabase
import com.example.dailydo.data.local.dao.ArticleDao
import com.example.dailydo.data.local.dao.TodoDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
  import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)

object DatabaseModule {

    @Provides
    @Singleton

    fun provideAppDatabase (
        @ApplicationContext context: Context

    ): AppDatabase{
        return Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            "dailydo_database"
        ).build()

    }
    @Provides
    @Singleton
    fun provideTodoDao(
        database: AppDatabase
    ): TodoDao{
        return  database.todoDao()
    }
    @Provides
    @Singleton
    fun provideArticleDao(
        database: AppDatabase
    ): ArticleDao{
        return  database.articleDao()
    }
}