package br.com.meli.apimetrosquadrados.model;

public class Comodo {
	private String nome;
	private double largura, comprimento;
	
	
	
	public Comodo() {
		super();
	}

	public Comodo(String nome, double largura, double comprimento) {
		super();
		this.nome = nome;
		this.largura = largura;
		this.comprimento = comprimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	
	
	
}
