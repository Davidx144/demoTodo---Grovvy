package com.example.demotodo.service.impl

import com.example.demotodo.entity.Todo
import com.example.demotodo.repository.TodoRepository
import com.example.demotodo.service.TodoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TodoServiceImpl implements TodoService {

    @Autowired
    TodoRepository todoRepository

    @Override
    List<Todo> findAll() {
        todoRepository.findAll()
    }

    @Override
    Todo findById(Integer todoId) {
        todoRepository.findById todoId get()
    }

    @Override
    Todo saveTodo(Todo todo){
        todoRepository.save todo
    }

    @Override
    Todo updateTodo(Todo todo){
        todoRepository.save todo
    }

    @Override
    Todo deleteTodo(Integer todoId){
        todoRepository.deleteById todoId
    }
}