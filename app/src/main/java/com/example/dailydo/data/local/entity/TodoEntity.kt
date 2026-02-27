package com.example.dailydo.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.dailydo.domain.model.Todo

@Entity(tableName = "todos")
data class TodoEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val description: String = "",
    val isCompleted: Boolean = false,
    val createdAt: Long = System.currentTimeMillis()
)

