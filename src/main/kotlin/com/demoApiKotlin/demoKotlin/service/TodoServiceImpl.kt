package com.demoApiKotlin.demoKotlin.service

import com.demoApiKotlin.demoKotlin.entites.Todo
import com.demoApiKotlin.demoKotlin.exceptions.NotFoundException

import org.springframework.stereotype.Service
import com.demoApiKotlin.demoKotlin.repository.TodoRepository
import com.demoApiKotlin.demoKotlin.service.TodoService
@Service
class TodoServiceImpl(val todoRepo: TodoRepository)  : TodoService {
    override fun createTodo(todo: Todo): Todo {
        return todoRepo.saveAndFlush(todo)
    }

    override fun getTodo(id: Long): Todo {
        return todoRepo.getOne(id) ?: throw NotFoundException("No Todo with id $id")
    }

    override fun getTodoList(): List<Todo> {
        return todoRepo.findAll()
    }

    override fun updateTodo(id: Long, todo: Todo): Todo {
        val result = todoRepo.getOne(id) ?: throw NotFoundException("No Todo with id $id")
        result.title = todo.title
        return todoRepo.saveAndFlush(result)
    }

    override fun deleteTodo(id: Long): Todo {
        val result = todoRepo.getOne(id) ?: throw NotFoundException("No Todo with id $id")
        todoRepo.delete(result)
        return result
    }

}