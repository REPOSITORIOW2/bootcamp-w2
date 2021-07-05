package com.meli.aula10.domain;

import com.meli.aula10.domain.enums.ProdutoCategoria;

import java.math.BigDecimal;
import java.util.List;

public class Produto {
    private int id;
    private String nome;
    private List<ProdutoCategoria> categorias;
    private int quantidade;
    private BigDecimal valor;

    public Produto() {
    }

    public Produto(int id, String nome, List<ProdutoCategoria> categorias, int quantidade, BigDecimal valor) {
        this.id = id;
        this.nome = nome;
        this.categorias = categorias;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<ProdutoCategoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<ProdutoCategoria> categorias) {
        this.categorias = categorias;
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

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", categorias=" + categorias +
                ", quantidade=" + quantidade +
                ", valor=" + valor +
                '}';
    }
}
