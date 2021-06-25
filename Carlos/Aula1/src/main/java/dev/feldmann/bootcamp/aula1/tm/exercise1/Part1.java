package dev.feldmann.bootcamp.aula1.tm.exercise1;

import java.util.Scanner;

public class Part1 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe o numero");
        var n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i * n);
        }
    }

}
