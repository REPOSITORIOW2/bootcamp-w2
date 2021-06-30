package com.mercadolivre;

public class Exercicio3 {

    private static boolean isPrime(Integer n){
        if(n < 2) return false;

        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Integer n = Integer.parseInt(args[0]);

        if(isPrime(n)){
            System.out.println(n + " é primo.");
        }else{
            System.out.println(n + " não é primo.");
        }
    }
}
