package com.example.todo.services.interfaces;

import com.example.todo.entities.Todo;

import java.util.List;
import java.util.Optional;

public interface ITodoService {
    List<Todo> getAllTodos();
    public Todo getByIdTodo(int id);
    void createTodo(Todo todo);
    Todo updateTodo(int id, Todo todo);
    void deleteTodo(int id);
}
