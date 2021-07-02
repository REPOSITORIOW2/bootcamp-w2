package br.com.meli.cliente;

public class Produto {
    private int id;
    private String descricao;
    private String cor;
    private int quantidade;
    private double preco;

    public Produto(int id, String descricao, String cor, int quantidade, double preco) {
        this.id = id;
        this.descricao = descricao;
        this.cor = cor;
        this.quantidade = quantidade;
        this.preco = preco;
    }
}
