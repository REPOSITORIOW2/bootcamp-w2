package br.com.meli.cliente;

import java.util.List;

public class Pedido {
    private long id;
    private List<Produto> produtos;
    private double valorDoPedido;
    Cliente cliente;

    public Pedido(long id, List<Produto> produtos, Cliente cliente) {
        this.id = id;
        this.produtos = produtos;
        this.valorDoPedido = valorDoPedido;
        this.cliente = cliente;
    }
}
