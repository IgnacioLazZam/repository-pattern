package com.example.repository_pattern.data.src

class InMemoryTaskRepository: TaskRepository {
    override suspend fun create(task: Task): Task {
        TODO("Not yet implemented")
    }

    override suspend fun update(task: Task): Task {
        TODO("Not yet implemented")
    }

    override suspend fun delete(id: String): Task {
        TODO("Not yet implemented")
    }

    override suspend fun readOne(id: String): Task {
        TODO("Not yet implemented")
    }

    override suspend fun readAll(): List<Task> {
        TODO("Not yet implemented")
    }
}