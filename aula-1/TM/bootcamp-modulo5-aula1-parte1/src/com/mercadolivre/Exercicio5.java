package com.mercadolivre;

public class Exercicio5 {

    private static boolean hasAtLeastMDigits(Integer n, Integer m, Integer d){
        String number = n.toString();
        Integer digitsMinCount = m;
        Character digit = (char)(d + '0');

        Long digitsCount = number.chars().filter(ch -> ch == digit).count();

        return digitsCount >= digitsMinCount;
    }

    public static void main(String[] args) {

        Integer n = Integer.parseInt(args[0]);
        Integer m = Integer.parseInt(args[1]);
        Integer d = Integer.parseInt(args[2]);

        for(int i = 0, k = 0; i < n; k++ ){
            if(hasAtLeastMDigits(k, m, d)){
                System.out.println(k);
                i++;
            }
        }
    }
}
