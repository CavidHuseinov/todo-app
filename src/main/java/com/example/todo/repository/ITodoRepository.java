package com.example.todo.repository;

import com.example.todo.entities.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITodoRepository extends JpaRepository<Todo, Integer> {
}
