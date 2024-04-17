package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "todos")
public class TodoList {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String descricao;
	private Boolean realizado;
	private int prioridade;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Boolean getRealizado() {
		return realizado;
	}
	public void setRealizado(Boolean realizado) {
		this.realizado = realizado;
	}
	public int getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}
	public TodoList(long id, String name, String descricao, Boolean realizado, int prioridade) {
		super();
		this.id = id;
		this.name = name;
		this.descricao = descricao;
		this.realizado = realizado;
		this.prioridade = prioridade;
	}
	
	
	

}
