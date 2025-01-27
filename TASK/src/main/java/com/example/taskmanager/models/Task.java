package com.example.taskmanager.models;

import com.example.taskmanager.enums.TaskPriority;

public class Task {
    private final int id;
    private final String description;
    private final TaskPriority priority;

    public Task(int id, String description, TaskPriority priority) {
        this.id = id;
        this.description = description;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public TaskPriority getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", priority=" + priority +
                '}';
    }
}
