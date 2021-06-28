package com.company;

public class Arma implements Comparable<Arma>{
    private String nome;
    private String habilidade;

    public Arma(String nome, String habilidade) {
        this.nome = nome;
        this.habilidade = habilidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }

    @Override
    public int compareTo(Arma o) {
        return this.nome.toLowerCase().compareTo(o.getNome().toLowerCase());
    }
}
