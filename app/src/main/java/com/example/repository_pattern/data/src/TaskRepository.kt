package com.example.repository_pattern.data.src

interface TaskRepository {
    suspend fun create(task: Task): Task
    suspend fun update(task: Task): Task
    suspend fun delete(id:String): Task
    suspend fun readOne(id:String): Task
    suspend fun readAll():List<Task>
}