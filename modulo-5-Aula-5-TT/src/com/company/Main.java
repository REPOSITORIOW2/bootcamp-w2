package com.company;

public class Main {
    public static void main(String[] args) {
        Arma arco = new Arma(Armas.ARCO, "Flecha perfurante");
        Arma espada = new Arma(Armas.ESPADA, "Espada furiosa");
        Arma cajado = new Arma(Armas.CAJADO, "Cajado bola de fogo");

        Personagem robson = new Personagem("Bruxão", "Robson", 100, arco );
        System.out.println(robson.usarHabilidade());
        robson.setSlot(espada);
        System.out.println(robson.usarHabilidade());
        robson.setSlot(cajado);
        System.out.println(robson.usarHabilidade());
     }
}
