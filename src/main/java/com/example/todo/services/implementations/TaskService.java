package com.example.todo.services.implementations;

import com.example.todo.entities.Task;
import com.example.todo.repository.ITaskRepository;
import com.example.todo.services.interfaces.ITaskService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TaskService implements ITaskService {

    final private ITaskRepository _taskRepo;

    public TaskService(ITaskRepository taskRepo) {
        _taskRepo = taskRepo;
    }

    @Override
    public List<Task> findAllTasks() {
        return _taskRepo.findAll();
    }

    @Override
    public Task findByIdTask(int id) {
        return _taskRepo.findById(id)
                .orElseThrow(()-> new RuntimeException("not found"));
    }

    @Override
    public void createTask(Task task) {
        _taskRepo.save(task);
    }

    @Override
    public Task updateTask(int id, Task task) {
       Task existingTask = _taskRepo.findById(id)
               .orElseThrow(() -> new RuntimeException("not found"));
       existingTask.setName(task.getName());
       existingTask.setDescription(task.getDescription());
       _taskRepo.save(existingTask);
       return existingTask;
    }

    @Override
    public void deleteTask(int id) {
        _taskRepo.deleteById(id);
    }
}
