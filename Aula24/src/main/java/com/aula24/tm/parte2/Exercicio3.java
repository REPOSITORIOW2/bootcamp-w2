package com.aula24.tm.parte2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Para um protótipo de supermercado, crie um programa que leia 3
 * produtos e imprima no console: nome, preço, quantidade e o valor total da compra.
 */
public class Exercicio3 {

    public static void main(String[] args) {
        try {

            Scanner scanner = new Scanner(System.in);

            List<Produto> produtosList = new ArrayList<>();
            int produtos = 0;
            while (produtos < 3) {
                System.out.print("Insira o nome do produto: ");
                String nome = scanner.next();
                System.out.print("Insira o preço do produto: ");
                double preco = Double.parseDouble(scanner.next());
                System.out.print("Insira a quantidade do produto: ");
                int quantidade = Integer.parseInt(scanner.next());

                Produto produto = new Produto();
                produto.setNome(nome);
                produto.setPreco(preco);
                produto.setQuantidade(quantidade);
                produtosList.add(produto);
                produtos++;
            }

            System.out.println("");

            for (int i = 0; i < produtos; i++) {
                System.out.println("Produto " + (i + 1));
                System.out.println(produtosList.get(i).getNome());
                System.out.println("R$" + produtosList.get(i).getPreco());
                System.out.println("Quantidade: " + produtosList.get(i).getQuantidade());
                System.out.println("-------");
            }

            double total = produtosList.stream().mapToDouble(e -> e.getPreco() * e.getQuantidade()).sum();

            System.out.println("Valor total: R$" + total);

        } catch (NumberFormatException ex) {
            System.out.println("Insira um numero valido");
        }
    }

    private static class Produto {

        private String nome;
        private double preco;
        private int quantidade;

        public Produto() {
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public double getPreco() {
            return preco;
        }

        public void setPreco(double preco) {
            this.preco = preco;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
        }
    }

}
