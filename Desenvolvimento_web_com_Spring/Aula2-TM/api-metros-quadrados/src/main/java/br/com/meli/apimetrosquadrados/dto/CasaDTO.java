package br.com.meli.apimetrosquadrados.dto;

import java.util.List;

import br.com.meli.apimetrosquadrados.model.Casa;
import br.com.meli.apimetrosquadrados.model.Comodo;

public class CasaDTO {
	private String nome, endereco;
	private List<Comodo> comodo;
	
 	
	
	
	public CasaDTO() {
		super();
	}

    public CasaDTO(Casa casa) { 
    	this.comodo = casa.getComodo();
    	this.endereco = casa.getEndereco();
    	this.nome = casa.getNome();
    }


	public CasaDTO(String nome, String endereco, List<Comodo> comodo) {
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
	

}
