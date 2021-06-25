package com.mercadolivre;

public class Exercicio4 {

    private static boolean isPrime(Integer n){
        if(n < 2) return false;

        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Integer n = Integer.parseInt(args[0]);

        for(int i = 0, k = 2; i < n; k++){
            if(isPrime(k)){
                System.out.println(k);
                i++;
            }
        }
    }
}
