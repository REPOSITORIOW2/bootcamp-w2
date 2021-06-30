package br.com.meli.modulo5.dia3.TT.arma;

import br.com.meli.modulo5.dia3.TT.personagem.Personagem;

import java.util.Locale;

public abstract class Arma implements Comparable<Arma> {
    protected String nome;
    protected double dano;

    public Arma(String nome, double dano) {
        this.nome = nome;
        this.dano = dano;
    }

    public String getNome() {
        return this.nome;
    }

    public abstract double calcularDano(Personagem p);

    public int compareTo(Arma a) {
        return this.nome.compareToIgnoreCase(a.nome);
    }
}
