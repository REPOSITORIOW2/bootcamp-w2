package br.com.meli.apimetrosquadrados.model;

import java.util.List;

import br.com.meli.apimetrosquadrados.dto.CasaDTO;

public class Casa {
	private long id;
	private String nome, endereco;
	private List<Comodo> comodo;
	
	
	
	
	public Casa() {
		super();
	}

	public Casa(CasaDTO casa) {
		super();
		this.nome = casa.getNome();
		this.endereco = casa.getEndereco();
		this.comodo = casa.getComodo();
	}


	public Casa(String nome, String endereco, List<Comodo> comodo) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.comodo = comodo;
	}




	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}




	public List<Comodo> getComodo() {
		return comodo;
	}




	public void setComodo(List<Comodo> comodo) {
		this.comodo = comodo;
	}




	public long getId() {
		return id;
	}




	public void setId(long id) {
		this.id = id;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nome+" : ";
	}
	

}
