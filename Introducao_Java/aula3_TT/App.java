package aula3_TT;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		Personagem p = new Personagem("Link", Classe.GUERREIRO, 1);
		List<Arma> armaPersonagem = new ArrayList<>();
		

		Arco arco = new Arco("Alvejador de Almas",10);
		Cajado cajado = new Cajado("Cajado",10);
		Espada espada = new Espada("Gelo", 10);
		
		

		armaPersonagem.add(arco);
		armaPersonagem.add(espada);
		armaPersonagem.add(cajado);
		
		armaPersonagem.sort(null);
		
		armaPersonagem.forEach(System.out::println);
		
		p.setArma(armaPersonagem);
		p.getArma().get(0).atacar();
		p.getArma().get(1).atacar();

		p.getArma().get(2).atacar();

		


	}
	
	



}
