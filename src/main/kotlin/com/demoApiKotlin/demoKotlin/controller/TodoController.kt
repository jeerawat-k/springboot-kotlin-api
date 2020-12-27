package com.demoApiKotlin.demoKotlin.controller

import com.demoApiKotlin.demoKotlin.entites.Todo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import com.demoApiKotlin.demoKotlin.service.TodoService

@RestController
@RequestMapping("api/v1/todos")
class TodoController @Autowired constructor(val todoService: TodoService) {
    @PostMapping
    fun createTodo(@RequestBody todo: Todo): ResponseEntity<Todo> {
        return ResponseEntity(todoService.createTodo(todo), HttpStatus.CREATED)
    }

    @GetMapping("/{id}")
    fun getTodo(@PathVariable id: Long): Todo {
        return todoService.getTodo(id)
    }

    @GetMapping
    fun getAllTodo(): List<Todo> {
        return todoService.getTodoList()
    }

    @PutMapping("/{id}")
    fun updateTodo(@PathVariable id: Long, @RequestBody todo: Todo): Todo {
        return todoService.updateTodo(id, todo)
    }

    @DeleteMapping("/{id}")
    fun deleteTodo(@PathVariable id: Long): Todo {
        return todoService.deleteTodo(id)
    }
}