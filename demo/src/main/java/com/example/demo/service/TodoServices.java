package com.example.demo.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.entity.TodoList;
import com.example.demo.repository.TodoRepository;

@Service
public class TodoServices {
	
	
	private TodoRepository todoRepository;
	
	
	public TodoServices(TodoRepository todoRepository) {
		super();
		this.todoRepository = todoRepository;
	}
	
	public List<TodoList> create(TodoList todoList){
		 todoRepository.save(todoList);
		 return list();
		
	}
	public List<TodoList> list(){
	Sort sort = Sort.by("Prioridade").descending().and(Sort.by("Nome").ascending());
		return todoRepository.findAll(sort);
	}
	public List<TodoList> update(TodoList todoList){
		todoRepository.save(todoList);
		return list();
	
}
	public List<TodoList> delete(Long id){
		todoRepository.deleteById(id);
		return list();
	
}	
	
	
	

}
