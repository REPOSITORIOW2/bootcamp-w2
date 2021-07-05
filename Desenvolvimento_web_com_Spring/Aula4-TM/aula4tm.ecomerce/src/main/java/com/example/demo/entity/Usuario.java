package com.example.demo.entity;

public class Usuario {

	private long id;
	private String nome;
	private String email;
	private boolean isAdmin;
	
	public Usuario(long id,String nome, String email, boolean isAdmin) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.isAdmin = isAdmin;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	
	
	
	
	
}
