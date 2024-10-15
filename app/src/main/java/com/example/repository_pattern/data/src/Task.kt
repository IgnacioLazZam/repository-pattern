package com.example.repository_pattern.data.src

import java.time.Instant

data class Task(
    val id: String,
    val title: String,
    val body: String,
    val completed: Boolean,
    val createAt: Instant

)
