package com.meli.aula03.tt;

public class Arco extends Arma {

    private int dano = 10;
    private String nome;


    public Arco(String nome){
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
        System.out.println("Atirei com "+ this.getNome() + " para " + this.getDano() + " de dano");
    }
}