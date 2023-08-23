package com.proyecto.samanthatipanguano.service;

import java.util.List;

import com.proyecto.samanthatipanguano.model.Task;

public interface TaskService {
    List<Task> getAllTasks();
    Task getTaskById(Long id);
    Task createTask(Task task);
    Task updateTask(Task task);
    void deleteTask(Long id);
}
