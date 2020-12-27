package com.demoApiKotlin.demoKotlin.service

import com.demoApiKotlin.demoKotlin.entites.TodoItem
import com.demoApiKotlin.demoKotlin.exceptions.NotFoundException
import org.springframework.stereotype.Service
import com.demoApiKotlin.demoKotlin.repository.TodoItemRepository
import com.demoApiKotlin.demoKotlin.repository.TodoRepository

@Service
class TodoItemServiceImpl (val todoRepo: TodoRepository, val todoItemRepo: TodoItemRepository) : TodoItemService {
    override fun createTodoItem(todoId: Long, todoItem: TodoItem): TodoItem {
        val todo = todoRepo.getOne(todoId) ?: throw NotFoundException("No Todo with id $todoId")
        todoItem.todo = todo
        return todoItemRepo.saveAndFlush(todoItem)
    }

    override fun updateTodoItem(id: Long, todoItem: TodoItem): TodoItem {
        val result = todoItemRepo.getOne(id) ?: throw NotFoundException("No TodoItem with id $id")
        result.content = todoItem.content
        result.complete = todoItem.complete
        return todoItemRepo.saveAndFlush(result)
    }

    override fun deleteTodoItem(id: Long): TodoItem {
        val result = todoItemRepo.getOne(id) ?: throw NotFoundException("No TodoItem with id $id")
        todoItemRepo.delete(result)
        return result
    }
}