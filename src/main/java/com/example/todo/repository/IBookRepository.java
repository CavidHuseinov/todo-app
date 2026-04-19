package com.example.todo.repository;

import com.example.todo.entities.Book;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book, Integer> {
}
