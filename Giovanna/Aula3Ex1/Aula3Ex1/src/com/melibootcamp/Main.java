package com.melibootcamp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*Antes de compilar, Chame o metodo do exercicio
        que sera analisado;) */
    }
    public static void Ex1NumerosPares(){
        Scanner sc1 = new Scanner(System.in);
        int valorLimite = sc1.nextInt();
        for(int i=0; i< valorLimite; i=i+2){
            System.out.println(i);
        }
    }
    public static  void Ex2MultiplosDeM(){
        Scanner sc1 = new Scanner(System.in);
        int valorLimite = sc1.nextInt();
        int multiplo = sc1.nextInt();
        for(int i=0; i< valorLimite; i=i+multiplo){
            System.out.println(i);
        }
    }
    public static void Ex3CheckarNumeroPrimo(){
        Scanner sc1 = new Scanner(System.in);
        int valorCheckado = sc1.nextInt();
        if (valorCheckado <= 1){
            System.out.println("Nao eh primo");
            return;
        }
        for (int i = 2; i < valorCheckado; i++){
            if (valorCheckado % i == 0 && i!= valorCheckado){
                System.out.println("Nao eh primo");
                return;
            }
        }
        System.out.println("eh primo");
    }
    static boolean CheckarPrimo(int valorCheckado)
    {
        if (valorCheckado <= 1){
            return false;
        }
        for (int i = 2; i < valorCheckado; i++){
            if (valorCheckado % i == 0 && i!= valorCheckado){
                return false;
            }
        }
        return true;
    }
    public static void Ex4ListarNumerosPrimos(){
        Scanner sc1 = new Scanner(System.in);
        int valorLimite = sc1.nextInt();
        for (int j = 2; j <= valorLimite; j++){
            if(CheckarPrimo(j)){
                System.out.println(j);}
        }
    }
    public static void Ex5PrimeirosN(){
        var scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int encontrados = 0;
        int i = 1;
        while (encontrados < n) {
            if (contarNumeroDeDigitos(i, d) == m) {
                encontrados++;
                System.out.println(i);
            }
            i++;
        }
    }
    private static long contarNumeroDeDigitos(int number, int digito) {
        Character charDigito = Character.forDigit(digito, 10);
        String stringNumero = String.valueOf(number);
        return stringNumero.chars().filter(digit -> digit == charDigito).count();
    }
}
