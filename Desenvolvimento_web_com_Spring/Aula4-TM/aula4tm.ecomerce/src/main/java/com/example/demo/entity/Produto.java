package com.example.demo.entity;

import java.util.List;

public class Produto {

	
	private long id;
	private String nome;
	private double valor;
	private List<Categoria> categorias;
	
	public Produto(long id, String nome, double valor, List<Categoria> categorias) {
		super();
		this.id = id;
		this.nome = nome;
		this.valor = valor;
		this.categorias = categorias;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public List<Categoria> getCategorias() {
		return categorias;
	}
	
	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}
	
	
	
}
