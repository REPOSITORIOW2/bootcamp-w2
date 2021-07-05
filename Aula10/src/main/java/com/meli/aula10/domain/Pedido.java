package com.meli.aula10.domain;

import java.math.BigDecimal;
import java.util.List;

public class Pedido {
    private int id;
    private List<Produto> produtos;
    private int clientId;
    private BigDecimal totalPedido;

    public Pedido(int id, List<Produto> produtos, int clientId, BigDecimal totalPedido) {
        this.id = id;
        this.produtos = produtos;
        this.clientId = clientId;
        this.totalPedido = totalPedido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public BigDecimal getTotalPedido() {
        return totalPedido;
    }

    public void addProduto(Produto produto){
        this.produtos.add(produto);
        var totalProduto = produto.getValor().multiply(BigDecimal.valueOf(produto.getQuantidade()));
        this.totalPedido = this.totalPedido.add(totalProduto);
    }

    public void setTotalPedido(BigDecimal totalPedido) {
        this.totalPedido = totalPedido;
    }
}
