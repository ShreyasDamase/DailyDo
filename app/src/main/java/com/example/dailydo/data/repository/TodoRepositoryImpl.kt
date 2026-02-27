package com.example.dailydo.data.repository

import com.example.dailydo.data.local.dao.TodoDao

import com.example.dailydo.data.mapper.toDomain
import com.example.dailydo.data.mapper.toEntity
import com.example.dailydo.domain.model.Todo
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class TodoRepositoryImpl(
    private val todoDao: TodoDao

) : TodoRepository {
    override fun getAllTodos(
    ): Flow<List<Todo>> {
        return todoDao.getAllTodos().map { e ->
            e.map { it.toDomain() }
        }
    }

    override suspend fun addTodo(todo: Todo) {
        todoDao.insertTodo(todo.toEntity())
    }

    override suspend fun updateTodo(todo: Todo) {
        todoDao.updateTodo(todo.toEntity())
    }

    override suspend fun deleteTodo(todo: Todo) {
        todoDao.deleteTodo(todo.toEntity())
    }

}