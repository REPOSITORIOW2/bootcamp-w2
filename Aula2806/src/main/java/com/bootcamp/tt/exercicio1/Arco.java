package com.bootcamp.tt.exercicio1;

public class Arco extends Arma {

    public Arco(String nome, double dano) {
        super(nome, dano);
    }

    @Override
    public void atirar() {
        System.out.println("Flechei o oponente");
    }
}
