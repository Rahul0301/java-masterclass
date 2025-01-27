package com.example.taskmanager.interfaces;

import com.example.taskmanager.models.Task;

@FunctionalInterface
public interface TaskProcessor {
    void process(Task task);
}
