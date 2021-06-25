package dev.feldmann.bootcamp.aula1.tm.exercise1;

import java.util.Scanner;

public class Part4 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe a quantidade de números primos que deseja");
        int n = scanner.nextInt();

        int found = 0;
        int i = 2;
        while (found < n) {
            if (isPrime(i)) {
                found++;
                System.out.println("Número " + i + " é primo");
            }
            i++;
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
