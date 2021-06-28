package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Arma arco = new Arma("Arco", "Flecha perfurante");
        Arma espada = new Arma("Espada", "Espada furiosa");
        Arma cajado = new Arma("Cajado", "Cajado bola de fogo");
        Arma Machado = new Arma("Machado", "Machado do Thor");


        List<Arma> armas = new ArrayList<Arma>();
        armas.add(Machado);
        armas.add(arco);
        armas.add(espada);
        armas.add(cajado);


        Personagem robson = new Personagem(Classes.GUERREIRO, "Robson", 100, arco );
        System.out.println(robson.usarHabilidade());
        robson.setSlot(espada);
        System.out.println(robson.usarHabilidade());
        robson.setSlot(cajado);
        System.out.println(robson.usarHabilidade());

        System.out.println("------------Armas ordenadas cadastradas-------------");

        armas.sort(null);
        armas.forEach(item -> System.out.println(item.getNome()));
     }
}
