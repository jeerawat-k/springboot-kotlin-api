package com.demoApiKotlin.demoKotlin.service

import com.demoApiKotlin.demoKotlin.entites.TodoItem

interface TodoItemService {
    fun createTodoItem(todoId: Long, todoItem: TodoItem): TodoItem

    fun updateTodoItem(id: Long, todoItem: TodoItem): TodoItem

    fun deleteTodoItem(id: Long): TodoItem
}