package com.bootcamp.tt.exercicio1;

public class Faca extends Arma {

    public Faca(String nome, double dano) {
        super(nome, dano);
    }

    @Override
    public void atirar() {
        System.out.println("Cortei o oponente");
    }
}
