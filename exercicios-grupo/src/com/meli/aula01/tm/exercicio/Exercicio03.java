package com.meli.aula01.tm.exercicio;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int countDivisores = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                countDivisores=countDivisores+1;
            }
        }
        if(countDivisores>2){
            System.out.println(n + " não é primo!");
        }
        else{
            System.out.println(n + " é primo!");
        }
    }
}