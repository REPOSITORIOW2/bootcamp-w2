package com.bootcamp.tt.exercicio1;

public class Classe implements Comparable<Classe> {

    private String nome;

    public Classe(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }

    @Override
    public int compareTo(Classe o) {
        return this.getNome().compareTo(o.getNome());
    }
}
