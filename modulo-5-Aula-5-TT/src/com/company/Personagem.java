package com.company;

public class Personagem {
    private String classe;
    private String nome;
    private int nivel;
    private Arma slot;

    public Personagem(String classe, String nome, int nivel, Arma slot) {
        this.classe = classe;
        this.nome = nome;
        this.nivel = nivel;
        this.slot = slot;
    }

    public String usarHabilidade(){
        return "O personagem " + this.nome + " usou a habilidade: " + slot.getHabilidade();
    }

    public void setSlot(Arma slot) {
        this.slot = slot;
    }
}
