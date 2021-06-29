package aula3_TT;

public class Cajado extends Arma{
	
	public Cajado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cajado(String nome, int dano) {
		super(nome, dano);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void atacar() {
		System.out.println("Deu uma cajadada!");		
	}
	

	@Override
	public int compareTo(Arma a) {
		return super.getNome().compareTo(a.getNome());
	}
}
