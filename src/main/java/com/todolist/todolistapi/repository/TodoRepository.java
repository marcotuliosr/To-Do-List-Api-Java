package com.todolist.todolistapi.repository;

import com.todolist.todolistapi.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
