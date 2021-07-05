package com.meli.aula10.domain;

import com.meli.aula10.domain.enums.ProdutoCategoria;

import java.math.BigDecimal;

public class Produto {

    private String nome;
    private ProdutoCategoria categoria;
    private int quantidade;
    private BigDecimal valor;

    public Produto(String nome, ProdutoCategoria categoria, int quantidade, BigDecimal valor) {
        this.nome = nome;
        this.categoria = categoria;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ProdutoCategoria getCategoria() {
        return categoria;
    }

    public void setCategoria(ProdutoCategoria categoria) {
        this.categoria = categoria;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
