package com.bootcamp.tt.exercicio1;

public class Espada extends Arma {

    public Espada(String nome, double dano) {
        super(nome, dano);
    }

    @Override
    public void atirar() {
        System.out.println("Perfurei o oponente");
    }
}
