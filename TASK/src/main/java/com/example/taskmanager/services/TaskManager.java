package com.example.taskmanager.services;

import com.example.taskmanager.models.Task;

import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class TaskManager {
    private final ExecutorService executorService = Executors.newFixedThreadPool(3);
    private final List<Task> taskList = Collections.synchronizedList(new ArrayList<>());

    public void addTask(Task task) {
        synchronized (taskList) {
            taskList.add(task);
            System.out.println("Task added: " + task);
        }
    }

    public void processTasks() {
        taskList.forEach(task -> {
            TaskExecutor.executeTask(task, executorService);
        });
    }

    public void shutdown() {
        executorService.shutdown();
    }
}
