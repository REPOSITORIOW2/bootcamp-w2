package br.com.mercadolivre.ecommerce_novo.Produto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Produto {

    private Long id;
    private String nome;
    private BigDecimal valor;
    private int quantidade;
    private List<Categorias> categorias;

    public Produto(Long id, String nome, BigDecimal valor, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
        this.categorias = new ArrayList<>();
    }

    public Produto(Long id, String nome, BigDecimal valor, int quantidade, List<Categorias> categorias) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
        this.categorias = categorias;
    }

    public Produto(Long id, ProdutoDTO produtoDTO) {
        this.id = id;
        this.nome = produtoDTO.getNome();
        this.valor = produtoDTO.getValor();
        this.quantidade = produtoDTO.getQuantidade();
        this.categorias = produtoDTO.getCategorias();
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

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public List<Categorias> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categorias> categorias) {
        this.categorias = categorias;
    }
}
