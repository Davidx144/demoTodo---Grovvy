package com.example.demotodo.repository

import com.example.demotodo.entity.Todo
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TodoRepository extends JpaRepository<Todo, Integer>{}