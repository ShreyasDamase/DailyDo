package com.example.dailydo.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.dailydo.data.local.entity.TodoEntity
import kotlinx.coroutines.flow.Flow

@Dao
 interface TodoDao {
     @Query("SELECT *  FROM todos ORDER BY createdAt DESC")
     fun getAllTodos() : Flow<List<TodoEntity>>
     @Insert(onConflict = OnConflictStrategy.Companion.REPLACE)
     suspend fun insertTodo(todo: TodoEntity)

     @Update
     suspend fun updateTodo(todo: TodoEntity)
     @Delete
     suspend fun deleteTodo(todo: TodoEntity)
     @Query("DELETE FROM todos WHERE id = :id")
     suspend fun deleteTodoById(id: Int)
 }