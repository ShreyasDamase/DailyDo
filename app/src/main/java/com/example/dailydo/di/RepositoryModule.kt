package com.example.dailydo.di

import com.example.dailydo.data.repository.NewsRepository
import com.example.dailydo.data.repository.NewsRepositoryImpl
import com.example.dailydo.data.repository.TodoRepository
import com.example.dailydo.data.repository.TodoRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindTodoRepository(
        impl: TodoRepositoryImpl
    ): TodoRepository

    @Binds
    @Singleton
    abstract fun bindArticleRepository(
        impl: NewsRepositoryImpl
    ): NewsRepository
}