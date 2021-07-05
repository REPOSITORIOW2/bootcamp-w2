package br.com.meli.modulo6aula4.dtos;

import br.com.meli.modulo6aula4.enums.ProdutoEnum;

public class ProdutosDTO {

    private Long id;
    private String nome;
    private Double preco;
    private ProdutoEnum categoria;

    public ProdutosDTO(Long id, String nome, Double preco, ProdutoEnum categoria) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ProdutosDTO() {
    }

    public ProdutoEnum getCategoria() {
        return categoria;
    }

    public void setCategoria(ProdutoEnum categoria) {
        this.categoria = categoria;
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

    public void update (ProdutosDTO produtos){
        setCategoria(produtos.getCategoria());
        setPreco(produtos.getPreco());
        setNome(produtos.getNome());
    }
}
