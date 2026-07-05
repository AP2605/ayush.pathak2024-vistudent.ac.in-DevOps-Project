package com.example.tourism_info_portal.service;

import com.example.tourism_info_portal.model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    private final List<Task> tasks = new ArrayList<>();

    public TaskService() {

        tasks.add(
                new Task(
                        1L,
                        "Paris",
                        "France",
                        1800,
                        5
                )
        );

        tasks.add(
                new Task(
                        2L,
                        "Kyoto",
                        "Japan",
                        2200,
                        7
                )
        );

        tasks.add(
                new Task(
                        3L,
                        "Santorini",
                        "Greece",
                        2000,
                        6
                )
        );
    }

    public List<Task> getAllTasks() {
        return tasks;
    }

    public Task addTask(Task task) {
        tasks.add(task);
        return task;
    }

    public Optional<Task> getTaskById(Long id) {
        return tasks.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();
    }

    public void deleteTask(Long id) {
        tasks.removeIf(
                p -> p.getId().equals(id)
        );
    }
}