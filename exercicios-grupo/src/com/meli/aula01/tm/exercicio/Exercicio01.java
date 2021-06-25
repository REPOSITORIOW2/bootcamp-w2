package com.meli.aula01.tm.exercicio;
import java.util.Scanner;


public class Exercicio01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(i * 2);
        }
    }
}
