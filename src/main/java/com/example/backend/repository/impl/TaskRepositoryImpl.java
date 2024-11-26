package com.example.backend.repository.impl;

import com.example.backend.domain.task.Task;
import com.example.backend.repository.TaskRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class TaskRepositoryImpl implements TaskRepository {


    @Override
    public Optional<Task> findById(long id) {
        return Optional.empty();
    }

    @Override
    public List<Task> findAllByUserId(long userId) {
        return List.of();
    }

    @Override
    public void assignToUserById(long userId, long taskId) {

    }

    @Override
    public void updateTask(Task task) {

    }

    @Override
    public void createTask(Task task) {

    }

    @Override
    public void deleteTaskById(long id) {

    }
}
