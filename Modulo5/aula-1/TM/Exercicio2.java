package com.mercadolivre;

public class Exercicio2 {

    public static void main(String[] args) {

        Integer n = Integer.parseInt(args[0]);
        Integer m = Integer.parseInt(args[1]);

        Integer number = 0;

        for(int i = 0 ; i < n; i++){
            System.out.println(number);
            number += m;
        }
    }
}
