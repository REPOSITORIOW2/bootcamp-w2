package aula3_TT;

public abstract class Arma implements Comparable<Arma> {
	private String nome;
	private int dano;
		
	public Arma() {
		super();
	}
	
	public abstract void atacar();
	
	
	public Arma(String nome, int dano) {
		super();
		this.nome = nome;
		this.dano = dano;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getDano() {
		return dano;
	}
	public void setDano(int dano) {
		this.dano = dano;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nome;
	}
	

}
