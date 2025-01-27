package com.example.taskmanager.services;

import com.example.taskmanager.models.Task;

import java.util.concurrent.ExecutorService;

public class TaskExecutor {
    public static void executeTask(Task task, ExecutorService executorService) {
        executorService.submit(() -> {
            System.out.println("Processing task: " + task);
            try {
                Thread.sleep(1000); // Simulate task processing
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
    }
}
