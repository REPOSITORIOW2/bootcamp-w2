package com.melibootcamp;

public class Main {

    public static void main(String[] args) {
        Arma arcoFisico = new Arma("Arco fisico",10,EnumTipoArma.FISICO );
        Arma cajado = new Arma("Cajado de vento",23,EnumTipoArma.MAGICO );
        Arma Machado = new Arma("Machado de orc",30,EnumTipoArma.FISICO );  
        Personagem personagem = new Personagem("Juan", EnumClasse.MAGO, 2, cajado);
        System.out.println(personagem.toString());
        AcoesPersonagem.atacar(personagem);
        AcoesPersonagem.trocarArma(Machado, personagem);
        System.out.println(personagem.toString());
        AcoesPersonagem.atacar(personagem);
        AcoesPersonagem.trocarArma(arcoFisico, personagem);
        System.out.println(personagem.toString());
        AcoesPersonagem.atacar(personagem);
    }
}
