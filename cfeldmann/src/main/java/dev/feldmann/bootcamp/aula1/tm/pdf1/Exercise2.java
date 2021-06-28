package dev.feldmann.bootcamp.aula1.tm.pdf1;

import java.util.Scanner;

public class Exercise2 {


    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.println("Informe quantos números deseja calcular:");
        int n = scanner.nextInt();
        System.out.println("Informe de qual número eles devem ser multiplos:");
        int m = scanner.nextInt();

        for (int i = m; i <= m * n; i += m) {
            System.out.println(i);
        }


    }
}
