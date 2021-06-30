package aula3_TT;

public class Espada extends Arma{
	
	

	public Espada() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Espada(String nome, int dano) {
		super(nome, dano);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void atacar() {
		System.out.println("Deu uma espadada!");		
	}
	
	
	@Override
	public int compareTo(Arma a) {
		return super.getNome().compareTo(a.getNome());
	}

}
