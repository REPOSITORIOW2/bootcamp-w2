package br.com.meli.cliente;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

public class Pedido {
    private long id;
    private List<Produto> produtos;
    private double valorDoPedido;
    @JsonIgnore
    Cliente cliente;

    public Pedido(long id, List<Produto> produtos, Cliente cliente) {
        this.id = id;
        this.produtos = produtos;
        this.valorDoPedido = valorDoPedido;
        this.cliente = cliente;
    }

    public long getId() {
        return id;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public double getValorDoPedido() {
        return valorDoPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
