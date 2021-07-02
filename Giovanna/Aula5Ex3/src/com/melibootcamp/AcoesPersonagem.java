package com.melibootcamp;

public class AcoesPersonagem {
    public static void trocarArma(Arma arma, Personagem personagem){
        personagem.setArma(arma);
    }
    public static void atacar(Personagem personagem){
        if(personagem.getArma().getTipoArma() == EnumTipoArma.FISICO) {
            System.out.println("Ataque causou dano fisico de " + personagem.getArma().getDanoBase());
        }
        else{
            System.out.println("Ataque causou dano magico de " + personagem.getArma().getDanoBase());
        }
    }
}
