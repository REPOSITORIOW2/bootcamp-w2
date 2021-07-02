package com.melibootcamp;

public class Personagem {
private String nome;
private EnumClasse classe;
private int nivel;
private Arma arma;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public EnumClasse getClasse() {
        return classe;
    }

    public void setClasse(EnumClasse classe) {
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

    public Personagem(String nome, EnumClasse classe, int nivel, Arma arma) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.arma = arma;
    }
    public Personagem(String nome, EnumClasse classe, int nivel) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.arma = arma;
    }

    @Override
    public String toString() {
        return "Personagem " +
                 nome +
                " esta equipando um(a) "  + arma.getNome();
    }
}
