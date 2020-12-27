package com.demoApiKotlin.demoKotlin.service

import com.demoApiKotlin.demoKotlin.entites.Todo

interface TodoService {
    fun createTodo(todo: Todo): Todo

    fun getTodo(id: Long): Todo

    fun getTodoList(): List<Todo>

    fun updateTodo(id: Long, todo: Todo): Todo

    fun deleteTodo(id: Long): Todo
}