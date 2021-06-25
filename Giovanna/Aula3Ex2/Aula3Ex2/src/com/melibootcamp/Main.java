package com.melibootcamp;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*Antes de compilar, Chame o metodo do exercicio
        que sera analisado;) */
    }
    public static void ex1ExibirArray(){
        Integer[] array ={52,10,85,1324,01,13, 62,30, 12,127};
        Arrays.sort(array);
        System.out.println("ordem crescente");
        for(int i=0; i< array.length -1;i++ ){
            System.out.println(array[i]);
        }
        System.out.println("ordem decrescente");
        for(int i=array.length-1; i>=0;i-- ){
            System.out.println(array[i]);
        }
    }
    public static void ex2Empresa(){
        int ano = 2021;
        double valorAtualEmpresa1= 1_130_000;
        double valorAtualEmpresa2 = 18_400_000;
        double taxaEmpresa1=1.48;
        double taxaEmpresa2=0.32;

        while(valorAtualEmpresa1< valorAtualEmpresa2){
            valorAtualEmpresa1 = valorAtualEmpresa1 * (1+ taxaEmpresa1);
            valorAtualEmpresa2 = valorAtualEmpresa2 * (1+ taxaEmpresa2);
            ano++;
            System.out.println(String.format("Empresa X - 01/01/%d - Valor da empresa: %.2fm",ano, valorAtualEmpresa1));
            System.out.println(String.format("Empresa X - 01/01/%d - Valor da empresa: %.2fm",ano, valorAtualEmpresa1));
        }
    }
    public static void ex3Produtos(){
        var produtos = new Produto[3];
        Scanner scanner = new Scanner(System.in);
        int i =0;
        while(i < 3){
            System.out.println("Digite o nome");
            String nome = scanner.next();
            System.out.println("Digite o preco");
            double preco = scanner.nextDouble();
            System.out.println("Digite a quantidade");
            int quantidade = scanner.nextInt();
            var produto = new Produto(nome, preco, quantidade);
            produtos[i] = produto;
            i++;
        }
        double valorTotal = 0;
        for(int j = 0; j <3; j++){
            System.out.println("Produto " + j+1);
            System.out.println(produtos[j].informacoes());
            valorTotal += produtos[j].preco * produtos[j].quantidade;
        }
        System.out.println("Valor total: R$:" + valorTotal);
    }
    public static class Produto{
        private String nome;
        private double preco;
        private int quantidade;

        public Produto(String nome, double preco, int quantidade) {
            this.nome = nome;
            this.preco = preco;
            this.quantidade = quantidade;
        }

        public String informacoes() {
            return String.format("%s\nPreço Unidade: R$%.2f\nQuantidade: %d", nome, preco, quantidade);
        }
    }
}
