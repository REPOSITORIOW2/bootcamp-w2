package com.mercadolivre;

public class Exercicio1 {

    public static void main(String[] args) {

        Integer n = Integer.parseInt(args[0]);

        Integer evenNumber = 0;

        for(int i = 0; i < n; i++){
            System.out.println(evenNumber);
            evenNumber += 2;
        }
    }
}
