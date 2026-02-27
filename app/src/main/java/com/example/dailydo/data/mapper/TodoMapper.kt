package com.example.dailydo.data.mapper

import com.example.dailydo.data.local.entity.TodoEntity
import com.example.dailydo.domain.model.Todo


fun TodoEntity.toDomain() = Todo(
    id = id,
    title = title,
    description = description,
    isCompleted = isCompleted,
    createdAt = createdAt
)

fun Todo.toEntity() = TodoEntity(
    id = id,
    title = title,
    description = description,
    isCompleted = isCompleted,
    createdAt = createdAt
)