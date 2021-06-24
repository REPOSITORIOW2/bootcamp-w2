package poo.aulaum.tm.exerciciodois;

import static java.lang.System.out;

//Exercício 3:
// Para um protótipo de supermercado, crie um programa que leia 3 produtos e imprima no console: nome, preço, quantidade e o valor total da compra.
public class Atividade3 {
    public static void main(String[] args) {
        var produtos = new Produto[3];
        produtos[0] = new Produto("Arroz", 10.99, 2);
        produtos[1] = new Produto("Feijão", 14.49, 1);
        produtos[2] = new Produto("Tomate", 9.99, 5);

        var valorTotal = 0.0;
        for (int i = 0; i < produtos.length; i++) {
            var produto = produtos[i];
            valorTotal+=produto.getPreco() * produto.getQuantidade();
            out.printf("\n Produto %s \n %s \n R$%s \n Quantidade: %s \n", i+1, produto.getNome(), produto.getPreco(), produto.getQuantidade());
        }

        out.println("\n Valor total: " + valorTotal);
    }

}

class Produto {
    private String nome;
    private Double preco;
    private int quantidade;

    public Produto(String nome, Double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}