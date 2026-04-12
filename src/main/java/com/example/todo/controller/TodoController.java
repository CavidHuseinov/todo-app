package com.example.todo.controller;

import com.example.todo.entities.Todo;
import com.example.todo.services.implementations.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {
    private final TodoService _todoService;

    public TodoController(TodoService todoService) {
        _todoService = todoService;
    }
    @GetMapping
    public List<Todo> getAll() {
        return _todoService.getAllTodos();
    }

    @PostMapping
    public void create(@RequestBody Todo todo) {
        _todoService.createTodo(todo);
    }

    @GetMapping("/{id}")
    public Todo getById(@PathVariable int id) {
        return _todoService.getByIdTodo(id);
    }

    @PutMapping("/{id}")
    public Todo update(@PathVariable int id, @RequestBody Todo todo) {
        return _todoService.updateTodo(id, todo);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        _todoService.deleteTodo(id);
    }
}
