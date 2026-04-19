package com.example.todo.services.interfaces;

import com.example.todo.entities.Book;
import com.example.todo.entities.Task;

import java.util.List;

public interface IBookService {
    List<Book> findAllBooks();
    Book findBookWithId(int id);
    void createBook(Book book);
    Book updateBook(int id, Book book);
    void deleteBook(int id);
}
