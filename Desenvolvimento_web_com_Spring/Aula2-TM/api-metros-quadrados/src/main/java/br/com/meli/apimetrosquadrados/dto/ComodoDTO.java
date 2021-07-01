package br.com.meli.apimetrosquadrados.dto;

import br.com.meli.apimetrosquadrados.model.Comodo;

public class ComodoDTO {
	private String nome;
	private double area;
	
	
	 
	
	public ComodoDTO(Comodo c) {
		this.nome = c.getNome();
		this.area = c.getComprimento()*c.getLargura();
	}




	public ComodoDTO(String nome, double area) {
		super();
		this.nome = nome;
		this.area = area;
	}




	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public double getArea() {
		return area;
	}




	public void setArea(double area) {
		this.area = area;
	}
	


}
