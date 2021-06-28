package com.meli.aula03.tt;

public class Personagem{
    String classe;
    Arma x;

    public String getSlot_arma() {
        return slot_arma;
    }

    public void setSlot_arma(String slot_arma) {
        this.slot_arma = slot_arma;
    }

    int nivel;

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    String slot_arma;

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Personagem(String classe, Arma arma){
        this.classe = classe;
        this.x = arma;
    }
}