package com.meli.aula03.tt;
public class Espada extends Arma{

    private final int dano = 10;
    private final String nome;


    public Espada(String nome){
        this.nome = nome;
    }

    public int getDano() {
        return dano;
    }


    public String getNome() {
        return nome;
    }

    @Override
    public void bater() {
        System.out.println("bati com "+ this.getNome() + " para " + this.getDano() + " de dano");
    }
}