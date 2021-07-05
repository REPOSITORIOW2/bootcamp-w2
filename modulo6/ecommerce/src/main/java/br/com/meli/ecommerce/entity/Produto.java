package br.com.meli.ecommerce.entity;

import java.util.List;

public class Produto {
    protected String codigo;
    protected String descricao;
    protected double preco;
    protected List<String> categorias;

    public Produto(String codigo, String descricao, double preco, List<String> categorias) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.categorias = categorias;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public List<String> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<String> categorias) {
        this.categorias = categorias;
    }

    public void setCategorias(String categoria) {
        this.categorias.add(categoria);
    }
}
