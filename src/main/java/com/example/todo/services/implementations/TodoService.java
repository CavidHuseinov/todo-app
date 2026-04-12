package com.example.todo.services.implementations;

import com.example.todo.entities.Todo;
import com.example.todo.repository.ITodoRepository;
import com.example.todo.services.interfaces.ITodoService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TodoService implements ITodoService {

    private final ITodoRepository _todorepository;

    public TodoService(ITodoRepository repository) {
        _todorepository = repository;
    }


    @Override
    public List<Todo> getAllTodos() {
        return _todorepository.findAll();
    }

    @Override
    public Todo getByIdTodo(int id) {
        return _todorepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Not found"));
    }


    @Override
    public void createTodo(Todo todo) {
        _todorepository.save(todo);
    }

    @Override
    public Todo updateTodo(int id, Todo todo) {
        Todo existingTodo = _todorepository.findById(id)
                .orElseThrow(()-> new RuntimeException("not found"));
        existingTodo.setTitle(todo.getTitle());
        existingTodo.setContent(todo.getContent());
        _todorepository.save(existingTodo);
        return  _todorepository.save(existingTodo);

    }

    @Override
    public void deleteTodo(int id) {
      Todo todo = _todorepository.findById(id)
               .orElseThrow(() -> new RuntimeException("Not Found"));
       _todorepository.deleteById(id);

    }
}
