package aula3;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int par = 0;

        for(int i = 0; i < n; i++) {
            System.out.println(par);
            par += 2;
        }

        sc.close();
    }
}
