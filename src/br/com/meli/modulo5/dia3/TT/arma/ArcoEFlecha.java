package br.com.meli.modulo5.dia3.TT.arma;

import br.com.meli.modulo5.dia3.TT.personagem.Classe;
import br.com.meli.modulo5.dia3.TT.personagem.Personagem;

public class ArcoEFlecha extends Arma {

    public ArcoEFlecha(String nome, double dano) {
        super(nome, dano);
    }

    @Override
    public double calcularDano(Personagem p) {
        if (p.getClasse().equals(Classe.ARQUEIRO))
            return this.dano * 2;

        return this.dano;
    }
}
