package br.com.meli.modulo5.dia1.TM;

import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        //Desenvolva um programa para mostrar por console os primeiros n números primos, sendo um valor que o usuário irá inserir pelo console.
        Scanner scanner = new Scanner(System.in);
        //Recebe a quantidade de primos a apresentar
        System.out.println("Insira a quantidade de numeros desejado");
        int n = Integer.parseInt(scanner.nextLine());
        //Valida se é primo, e o apresenta
        int contador = 0;
        int numeroValidado = 2;
        while(contador<n){
            boolean primo = true;
            for(int i = 2;i<numeroValidado;i++){
                if(numeroValidado%i==0){
                    primo = false;
                    break;
                }
            }
            //Decide se é primo ou nao
            if(primo){
                System.out.println(numeroValidado);
                numeroValidado++;
                contador++;
            }else{
                numeroValidado++;
            }
            }
        }
    }

