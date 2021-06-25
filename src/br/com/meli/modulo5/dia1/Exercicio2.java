package br.com.meli.modulo5.dia1;

import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        //Desenvolva um programa para mostrar os primeiros n números múltiplos de m, sendo n e m valores que o usuário irá inserir via console.
        //Lembre-se que um número a é divisível por b se a é divisível por b.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de numeros desejado");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite por qual multiplo");
        int m = Integer.parseInt(scanner.nextLine());
        //System.out.println(n);
        //System.out.println(m);
        int aux = 1;
        int contador = 1;
        while(contador<=n){
            if(aux%m == 0){
                System.out.println(aux);
                aux++;
                contador++;
            }else{
                aux++;
            }
        }

    }
}
