package com.meli.aula03.tt;

public class Adaga extends Arma {

    private int dano = 5;
    private String nome;


    public Adaga(String nome){
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