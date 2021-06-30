package com.bootcamp.tt.exercicio1;

public class Personagem {

    private String username;
    private Classe classe;
    private int nivel;
    private Arma arma;

    public Personagem(String username, Classe classe, int nivel, Arma arma) {
        this.username = username;
        this.classe = classe;
        this.nivel = nivel;
        this.arma = arma;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }
}
