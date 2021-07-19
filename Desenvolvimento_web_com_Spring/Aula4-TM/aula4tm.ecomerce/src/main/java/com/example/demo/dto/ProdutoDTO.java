package com.example.demo.dto;

import java.util.List;

import com.example.demo.entity.Categoria;

public class ProdutoDTO {

	private String nome;
	private double valor;
	private List<Categoria> categorias;
	
	public ProdutoDTO(String nome, double valor, List<Categoria> categorias) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.categorias = categorias;
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
