package com.example.todo.controller;

import com.example.todo.entities.Task;
import com.example.todo.services.implementations.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    private final TaskService _taskService;

    public TaskController(TaskService taskService) {
        _taskService = taskService;
    }

    @GetMapping
    public List<Task> findAllTasks(){
      return   _taskService.findAllTasks();
    }
    @GetMapping("/{id}")
    public Task findByIdTask(@PathVariable int id){
       return  _taskService.findByIdTask(id);
    }
    @PostMapping
    public void createTask(@RequestBody Task task){
        _taskService.createTask(task);
    }
    @PutMapping("/{id}")
    public Task updateTask(@PathVariable int id ,@RequestBody Task task){
       return  _taskService.updateTask(id,task);
    }
    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable int id){
        _taskService.deleteTask(id);
    }


}
