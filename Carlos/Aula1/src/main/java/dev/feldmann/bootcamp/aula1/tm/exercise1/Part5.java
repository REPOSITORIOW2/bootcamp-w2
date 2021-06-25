package dev.feldmann.bootcamp.aula1.tm.exercise1;

import java.util.Scanner;

public class Part5 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        // Digito para verificar
        System.out.println("Informe qual digito você está procurando (d): ");
        int d = scanner.nextInt();
        // Quantidade do digito no nmro
        System.out.println("Informe quantos deste digito precisa existir no número (m):");
        int m = scanner.nextInt();

        // Quantidade dos números para se verificar
        System.out.println("Informe quantos números você quer receber:");
        int n = scanner.nextInt();


        if (d < 0 || d > 9) {
            System.out.println("Por favor informe somente 1 digito!");
            return;
        }

        System.out.println("Procurando " + n + " números que contenham no mínimo " + m + " digitos " + d);

        int found = 0;
        int i = 1;
        while (found < n) {
            if (countDigitsInNumber(i, d) == m) {
                found++;
                System.out.println("Encontrei " + i);
            }
            i++;
        }

    }


    private static long countDigitsInNumber(int number, int filterDigit) {
        Character filterDigitAsChar = Character.forDigit(filterDigit, 10);
        var numberAsString = String.valueOf(number);
        return numberAsString.chars().filter(digit -> digit == filterDigitAsChar).count();
    }
}
