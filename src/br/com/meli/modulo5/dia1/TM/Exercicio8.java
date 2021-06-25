package br.com.meli.modulo5.dia1.TM;

import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args) {
//        Para um protótipo de supermercado, crie um programa que leia 3 produtos e imprima no
//        console: nome, preço, quantidade e o valor total da compra.
        Scanner scanner = new Scanner(System.in);
        Produto[] produtos = new Produto[3];
        for(int i = 0;i < 3;i++){
            System.out.println("Digite o nome do produto "+(i+1));
            String nome = scanner.nextLine();
            System.out.println("Digite o preco do produto "+(i+1));
            double preco = scanner.nextDouble();
            System.out.println("Digite a quantidade do produto "+(i+1));
            int quantidade = scanner.nextInt();
            scanner.nextLine();
            produtos[i] = new Produto(nome, preco, quantidade);
        }

        for(int i = 0;i < 3;i++) {
            System.out.println("Produto "+(i+1));
            System.out.println(produtos[i].getNome());
            System.out.println("R$"+produtos[i].getPreco());
            System.out.println("Quantidade: "+produtos[i].getQuantidade());
            System.out.println("\n");
        }
    }
}

