package com.meli.aula10.domain;

import com.meli.aula10.domain.enums.TipoUsuario;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Usuario{
    private List<Pedido> pedidos;

    public Cliente() {
    }

    public Cliente(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public Cliente(int id, String nome, ArrayList<Pedido>pedidos) {
        super(id, nome, TipoUsuario.CLIENTE);
        this.pedidos = pedidos;
    }

    public void addPedido(Pedido pedido){
        this.pedidos.add(pedido);
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "pedidos=" + pedidos +
                '}';
    }
}
