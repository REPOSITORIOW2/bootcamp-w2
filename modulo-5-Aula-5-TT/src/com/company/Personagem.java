package com.company;

public class Personagem {
    private Classes classe;
    private String nome;
    private int nivel;
    private Arma slot;

    public Personagem(Classes classe, String nome, int nivel, Arma slot) {
        this.classe = classe;
        this.nome = nome;
        this.nivel = nivel;
        this.slot = slot;
    }

    public String usarHabilidade(){
        return "O personagem " + this.nome + " da classe " + this.classe + " usou a habilidade: " + slot.getHabilidade();
    }

    public void setSlot(Arma slot) {
        this.slot = slot;
    }
}
