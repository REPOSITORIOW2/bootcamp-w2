package br.com.meli.modulo5.dia3.TT;

import br.com.meli.modulo5.dia3.TT.arma.ArcoEFlecha;
import br.com.meli.modulo5.dia3.TT.arma.Arma;
import br.com.meli.modulo5.dia3.TT.arma.Cajado;
import br.com.meli.modulo5.dia3.TT.arma.Espada;
import br.com.meli.modulo5.dia3.TT.personagem.Classe;
import br.com.meli.modulo5.dia3.TT.personagem.Personagem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
         * Cada personagem possui uma arma "nativa", conforme instâncias abaixo. Caso um personagem ataque com a arma
         * "nativa", o dano é dobrado. Caso contrário, a arma causa apenas o dano instanciado.
         */
        Personagem mago = new Personagem("Mago", Classe.MAGO, new Cajado("Cajado de Ouro", 100.0));
        Personagem guerreiro = new Personagem("Guerreiro", Classe.GUERREIRO, new Espada("Espada de Ouro", 140.0));
        Personagem arqueiro = new Personagem("Arqueiro", Classe.ARQUEIRO, new ArcoEFlecha("Arco de Ouro", 125.0));

        mago.atacar();

        guerreiro.atacar();

        arqueiro.atacar();

        /*
         * Este personagem não deveria dobrar o dano de ataque pois está utilizando uma arma que não pertence a classe.
         */
        Personagem magoFake = new Personagem("Mago Fake", Classe.MAGO, new Espada("Espada de Prata", 110.0));

        magoFake.atacar();

        List<Arma> armas = new ArrayList<>();

        armas.add(mago.getArma());
        armas.add(guerreiro.getArma());
        armas.add(arqueiro.getArma());
        armas.add(magoFake.getArma());

        System.out.println("---- Armas antes da ordenação ----");
        armas.forEach(a -> System.out.println(a.getNome()));

        armas.sort(null);

        System.out.println("---- Armas após a ordenação ----");
        armas.forEach(a -> System.out.println(a.getNome()));
    }
}
