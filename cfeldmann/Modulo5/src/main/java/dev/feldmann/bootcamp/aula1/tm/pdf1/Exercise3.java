package dev.feldmann.bootcamp.aula1.tm.pdf1;

import java.util.Scanner;

public class Exercise3 {


    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.println("Informe o número que deseja verificar:");
        int n = scanner.nextInt();

        if (isPrime(n)) {
            System.out.println("O número é primo!");
        } else {
            System.out.println("Não é primo");
        }

    }

    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = n - 1; i > 1; i--) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;
    }
}
