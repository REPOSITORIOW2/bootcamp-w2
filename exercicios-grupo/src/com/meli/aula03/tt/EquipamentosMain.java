package com.meli.aula03.tt;
import java.util.Scanner;

public class EquipamentosMain {
    public static void main(String[] args) {
        Espada excalibur = new Espada("excalibur");
        Adaga littleone = new Adaga("littleone");
        Arco phoenixBow = new Arco("phoenixBow");

        System.out.println("Qual a classe do seu personagem?");
        Scanner sc = new Scanner(System.in);
        String nome_personagem = sc.nextLine();
        System.out.println("Qual arma voce quer usar? - 1= espada / 2=adaga / 3=Arco");
        int arma = sc.nextInt();
        Personagem pers;
        switch (arma) {
            case 1 -> {
                System.out.println("Voce escolheu a " + littleone.getNome() + " que tem " + littleone.getDano() + " de dano");
                pers = new Personagem(nome_personagem, littleone);
                System.out.println("Agora siga para sua aventura.");
            }
            case 2 -> {
                System.out.println("Voce escolheu a " + excalibur.getNome() + " que tem " + excalibur.getDano() + " de dano");
                pers = new Personagem(nome_personagem, excalibur);
                System.out.println("Agora siga para sua aventura.");
            }
            case 3 -> {
                System.out.println("Voce escolheu a " + phoenixBow.getNome() + " que tem " + phoenixBow.getDano() + " de dano");
                pers = new Personagem(nome_personagem, phoenixBow);
                System.out.println("Agora siga para sua aventura.");
            }
            default -> throw new RuntimeException("por favor selecione uma arma existente");
        }

    }
}