package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.TodoList;
import com.example.demo.service.TodoServices;

@RestController
@RequestMapping("/todos")
public class TodoController {
	
	private TodoServices todoServices;

	public TodoController(TodoServices todoServices) {
		super();
		this.todoServices = todoServices;
	}
	
	@PostMapping
	private List<TodoList> create(@RequestBody TodoList todoList){
		return todoServices.create(todoList);
		
	}
	
	@GetMapping
	private List<TodoList> list(){
		return todoServices.list();
		
	}
	
	@PostMapping
	private List<TodoList> update(@RequestBody TodoList todoList){
		return todoServices.update(todoList);
		
	}
	
	@DeleteMapping("{id}")
	private List<TodoList> delete(@PathVariable("id") Long id){
		
		return todoServices.delete(id);
	}

}
