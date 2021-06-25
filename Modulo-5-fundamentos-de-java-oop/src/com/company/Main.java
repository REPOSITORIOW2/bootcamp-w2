package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    // write your code here

        // exercicio 1.1
        /*
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de numeros: ");
        int n = scan.nextInt();
        int par = 0;

        for (int i = 0; i < n;i++){

            System.out.println(par);
            par += 2;

        } */

        // exercicio 1.2
        /*
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de numeros: ");
        int n = scan.nextInt();

        System.out.println("Digite o numero multiplo: ");
        int m = scan.nextInt();

        int multi = m;
        for (int i = 0; i < n; i++){

            if(i > 1){
                System.out.println(multi);
                multi += m;
            }else{
                System.out.println(i);
            }


        }*/

        // exercicio 1.3
        /*Scanner scan = new Scanner(System.in);

        System.out.println("Digite o numero para verificar se ele é primo: ");
        int n = scan.nextInt();
        boolean primo = true;

        for(int i = 2; i < n; i++)
        {

            if(n%i != 0) {
                primo = true;
            } else {
                primo = false;
                break;
            }

        }

        if(primo)
            System.out.println("Este numero é primo");
        else
            System.out.println("Este numero não é primo");*/

        // exercicio 1.4
        /*Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        boolean primo = true;

        int i = 0;
        int ultNumero = 2;

        while(i < n)
        {

            for(int j = 2; j < ultNumero; j++) {

                if(ultNumero%j != 0) {
                    primo = true;
                }else{
                    primo = false;
                    break;
                }

            }

            if(primo) {
                System.out.println(ultNumero);
                i++;
            }

            ultNumero++;

        }*/

        // exercicio 1.5
        /*Scanner scan = new Scanner(System.in);
        System.out.println("Digite quantos numeros:");

        int n = scan.nextInt();

        System.out.println("Digite qual o numero de repeticao do digito:");
        int m = scan.nextInt();

        System.out.println("Digite qual digito repetir:");
        int d = scan.nextInt();

        int i = 0;

        String sNumero = "";
        int numero = 0;

        // quantidade de numeros que retorno
        while(i < n){

            // aumento os numeros continuamente até encontrar as repetições desejadas
            while(true){

                sNumero = String.valueOf(numero);
                int repeticao = 0;

                // verifico se a quantidade de repetições do digito selecionado é a quantidade desejada
                for (int l = 0; l < sNumero.length(); l++) {
                    if (Integer.parseInt(String.valueOf(sNumero.charAt(l))) == d) {
                        repeticao++;
                    }
                }

                numero++;

                if(repeticao == m){
                    System.out.println(sNumero);
                    break;
                }

            }
            i++;
        }*/

        // exercicio 2.1
        /*int[] array = {52, 10, 85, 1324, 01, 13, 62, 30, 12, 127};

        Arrays.sort(array);

        System.out.println("ascendente");
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        System.out.println("descendente");
        for(int i = array.length-1; i >= 0; i--){
            System.out.println(array[i]);
        }*/

        // exercicio 2.2
        /*double empresaX = 1.13;
        double empresaY = 18.4;
        int ano = 2021;

        System.out.println("Empresa X - 01/01/" + ano + " - " + String.format("%.2f", empresaX) +"m");
        System.out.println("Empresa X - 01/01/" + ano + " - " + String.format("%.2f", empresaY) +"m");
        System.out.println("-----------------------------------------------------------------------------");

        while(empresaX < empresaY){

            empresaX += empresaX*1.48;
            empresaY += empresaY*0.32;
            ano++;

            System.out.println("Empresa X - 01/01/" + ano + " - " + String.format("%.2f", empresaX) +"m");
            System.out.println("Empresa X - 01/01/" + ano + " - " + String.format("%.2f", empresaY) +"m");
            System.out.println("-----------------------------------------------------------------------------");

        }*/

        // exercicio 2.3
        Produto[] aProduto = new Produto[3];
        double vlTotal = 0.0;

        aProduto[0] = new Produto(1,"Arroz", 10.99,2);
        aProduto[1] = new Produto(2,"Feijão", 14.49,1);
        aProduto[2] = new Produto(3,"Tomate", 9.99,5);

        System.out.println("lista de produtos: ");

        int len = aProduto.length;
        for (int i = 0; i<len; i++){
            System.out.println(aProduto[i].toString()+"\n");
            vlTotal += aProduto[i].getPreco() * aProduto[i].getQuantidade();
        }

        System.out.println("Valor Total: R$"+ String.format("%.2f",vlTotal));

    }
}
