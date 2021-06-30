package com.bootcamp.crudprodutos.models;

public class Produto {
    private Long id;

    private String nome;
    private String descricao;
    private double valor;




    public Produto(String nome, String descricao, Double valor) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }

    public Produto () {

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
