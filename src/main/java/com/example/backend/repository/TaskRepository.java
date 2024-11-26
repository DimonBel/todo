package com.example.backend.repository;

import com.example.backend.domain.task.Task;

import java.util.List;
import java.util.Optional;

public interface TaskRepository {

    Optional<Task> findById(long id);

    List<Task> findAllByUserId(long userId);

    void assignToUserById(long userId, long taskId);

    void updateTask(Task task);

    void createTask(Task task);

    void deleteTaskById(long id);

}
