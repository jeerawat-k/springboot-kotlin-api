package com.demoApiKotlin.demoKotlin.repository

import com.demoApiKotlin.demoKotlin.entites.Todo
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


interface TodoRepository : JpaRepository<Todo, Long> {


}
