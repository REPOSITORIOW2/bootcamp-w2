package dev.feldmann.bootcamp.modulo6.Aula2.restaurante.entity;

import lombok.Data;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Mesa {
    @Getter
    private final Long id;

    private List<Pedido> pedidos;

    public Mesa(Long id) {
        this.id = id;
        pedidos = new ArrayList<>();
    }


    public List<Pedido> getPedidos() {
        return new ArrayList<>(pedidos);
    }

    public Double calculateTotalPrice() {
        return pedidos.stream().mapToDouble(Pedido::calculateTotalPrice).sum();
    }

    public void clearPedidos() {
        pedidos.clear();
    }

    public boolean hasPedidos() {
        return pedidos.size() > 0;
    }

    public void addPedido(Pedido pedido){
        this.pedidos.add(pedido);
    }
}
