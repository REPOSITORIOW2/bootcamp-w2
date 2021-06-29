package aula3_TT;

import java.util.ArrayList;
import java.util.List;

public class Personagem {
	private String nome;
	private Classe classe;
	private int nivel;
	private List<Arma> armas = new ArrayList<Arma>();
	
		
	public Personagem() {
		
	}
	
	public Personagem(String nome, Classe classe, int nivel) {
		super();
		this.nome = nome;
		this.classe = classe;
		this.nivel = nivel;
	}
	
	public Personagem(String nome, Classe classe, int nivel, List<Arma> armas) {
		super();
		this.nome = nome;
		this.classe = classe;
		this.nivel = nivel;
		this.armas = armas;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Classe getClasse() {
		return classe;
	}
	public void setClasse(Classe classe) {
		this.classe = classe;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	public List<Arma> getArma() {
		return armas;
	}
	public void setArma(List<Arma> arma) {
		this.armas = arma;
	}
	
	

}
