package com.meli.aula02.tt.exercicio1;

import java.util.Scanner;

public class TestaSenha {
    String senha = "aaaaaa";

    Senha s1 = new Senha(senha);

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite qual o tipo de senha desejada: fraca, media, forte");

        String tipo = ler.nextLine();

        Senha pattern = switch (tipo) {
            case "fraca" -> new PasswordFraca();
            case "media" -> new PasswordMedia();
            case "forte" -> new PasswordForte();
            default -> throw new RuntimeException("Opção invalida");
        };

        String senha = ler.nextLine();

        try {
            pattern.setSenha(senha);
            System.out.println("Senha cadastrada com sucesso");
        } catch (SenhaException e) {
            System.out.println(e.getMessage());
        }

    }
}


