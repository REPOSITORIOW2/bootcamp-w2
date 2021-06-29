package com.meli.aula04.dakar;

public class Socorrista<V extends Veiculo>{

    public void socorrer(Veiculo a){
        System.out.println("Scorrendo " + a);
    }
}
