package com.bootcamp.restaurantecrud;

public class Prato {
    private long id;
    private String descricao;
    private double preco;
    private int quantidade;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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

    public Prato(long id, String descricao, double preco) {
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return
                " descricao " + descricao + '\'' + " preco " + preco +
                " quantidade " + quantidade;
    }
}
