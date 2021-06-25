package com.company;

public class Produto {

    private long id;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(int _id, String _nome, double _preco, int _quantidade){
        this.id = _id;
        this.nome = _nome;
        this.preco = _preco;
        this.quantidade = _quantidade;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public long getId() {
        return id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Produto " + id + "\n" +
                nome + "\n" +
                quantidade + "\n" +
                "R$" + preco;
    }
}
