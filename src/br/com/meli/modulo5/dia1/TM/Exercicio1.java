package br.com.meli.modulo5.dia1.TM;

import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
        //Desenvolva um programa para mostrar os primeiros n números pares, sendo n um valor que o usuário irá inserir pelo console.
        // Lembre-se que um número é par quando divisível por 2.
        Scanner scanner = new Scanner(System.in);
        int aux = 2;
        String n;
        System.out.print("Digite a quantidade de numeros pares desejados: ");
        n = scanner.nextLine();
        int naux = Integer.parseInt(n);
        for(int i = 1;i<=naux;i++){
            System.out.println(aux);
            aux += 2;
        }


    }
}