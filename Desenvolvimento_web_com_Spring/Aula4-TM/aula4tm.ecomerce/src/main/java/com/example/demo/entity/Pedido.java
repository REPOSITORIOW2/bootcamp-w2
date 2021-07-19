package com.example.demo.entity;

import java.util.List;

public class Pedido {

	private long id;
	private String nome;
	private Usuario usuario;
	private List<Produto> produtos;
	
	
	public Pedido(long id, String nome, Usuario usuario, List<Produto> produtos) {
		super();
		this.id = id;
		this.nome = nome;
		this.usuario = usuario;
		this.produtos = produtos;
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

	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	public List<Produto> getProdutos() {
		return produtos;
	}


	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	
	
	
	
	
}
