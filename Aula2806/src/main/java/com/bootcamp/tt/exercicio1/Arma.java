package com.bootcamp.tt.exercicio1;

public abstract class Arma implements Comparable<Arma> {

    private String nome;
    private double dano;

    public Arma(String nome, double dano) {
        this.nome = nome;
        this.dano = dano;
    }

    public abstract void atirar();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDano() {
        return dano;
    }

    public void setDano(double dano) {
        this.dano = dano;
    }

    @Override
    public String toString() {
        return nome + ", " +
                "Dano:" + dano;
    }

    @Override
    public int compareTo(Arma o) {
        return this.getNome().compareTo(o.getNome());
    }
}
