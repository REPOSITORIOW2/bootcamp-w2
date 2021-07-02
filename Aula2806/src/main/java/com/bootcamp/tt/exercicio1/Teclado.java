package com.bootcamp.tt.exercicio1;

public class Teclado extends Arma {

    public Teclado(String nome, double dano) {
        super(nome, dano);
    }

    @Override
    public void atirar() {
        System.out.println("Hackeei o oponente");
    }
}
