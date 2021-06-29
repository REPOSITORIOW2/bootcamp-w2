package aula3_TT;

public class Arco extends Arma implements Recarregar{
	
	public Arco() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Arco(String nome, int dano) {
		super(nome, dano);
		// TODO Auto-generated constructor stub
	}

	public void recarregar() {
		System.out.println("Colocou uma flexa no arco!");
	}

	@Override
	public void atacar() {
		System.out.println("Lançou uma flexa!");	
		recarregar();
	}

	@Override
	public int compareTo(Arma a) {
		return super.getNome().compareTo(a.getNome());
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.getNome();
	}
	

}
