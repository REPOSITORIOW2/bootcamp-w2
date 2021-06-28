package com.company;

public class Arma {
    private Armas nome;
    private String habilidade;

    public Arma(Armas nome, String habilidade) {
        this.nome = nome;
        this.habilidade = habilidade;
    }

    public Armas getNome() {
        return nome;
    }

    public void setNome(Armas nome) {
        this.nome = nome;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }
}
