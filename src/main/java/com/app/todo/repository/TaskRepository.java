package com.app.todo.repository;

import com.app.todo.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//@Repository
//JpaRepository provides CRUD operations for the Task entity
public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findAll();
}
