package com.example.todo.services.interfaces;

import com.example.todo.entities.Task;

import java.util.List;

public interface ITaskService {
    List<Task> findAllTasks();
    Task findByIdTask(int id);
    void createTask(Task task);
    Task updateTask(int id, Task task);
    void deleteTask(int id);
}
