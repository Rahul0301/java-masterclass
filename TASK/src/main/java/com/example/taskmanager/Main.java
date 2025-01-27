package com.example.taskmanager;

import com.example.taskmanager.enums.TaskPriority;
import com.example.taskmanager.models.Task;
import com.example.taskmanager.services.TaskManager;
import com.example.taskmanager.utils.RegexUtil;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        // Add Tasks
        taskManager.addTask(new Task(1, "Fix login issue", TaskPriority.HIGH));
        taskManager.addTask(new Task(2, "Optimize database query", TaskPriority.MEDIUM));

        // Process Tasks
        taskManager.processTasks();

        // Demonstrate Regex
        String logMessage = "Task [ID: 1] - Status: Completed";
        RegexUtil.extractTaskDetails(logMessage);

        // Shutdown Task Manager
        taskManager.shutdown();
    }
}
