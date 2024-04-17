package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.TodoList;

public interface TodoRepository extends JpaRepository<TodoList, Long> {

}
