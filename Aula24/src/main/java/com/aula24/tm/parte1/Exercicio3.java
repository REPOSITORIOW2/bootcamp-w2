package com.aula24.tm.parte1;

import java.util.Scanner;

/**
 * Desenvolva um programa para informar se um um número n é primo ou não, sendo n
 * um valor que o usuário irá inserir pelo console.
 * Lembre-se que um número é primo quando só é divisível por 1 e por si mesmo.
 */
public class Exercicio3 {

    public static boolean ehPrimo(int numero) {
        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Insira o número base: ");
            int numeroBase = Integer.parseInt(scanner.next());

            boolean primo = ehPrimo(numeroBase);
            System.out.println("O número " + numeroBase + " " + (primo? "é primo" : "não é primo") + ".");
        } catch (NumberFormatException exception) {
            System.out.println("Insira um número válido");
        }

        scanner.close();
    }

}
