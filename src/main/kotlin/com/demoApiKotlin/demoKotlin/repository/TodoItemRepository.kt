package com.demoApiKotlin.demoKotlin.repository

import com.demoApiKotlin.demoKotlin.entites.TodoItem
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TodoItemRepository : JpaRepository<TodoItem, Long> {
}