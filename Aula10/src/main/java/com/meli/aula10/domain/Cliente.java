package com.meli.aula10.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.meli.aula10.domain.enums.TipoUsuario;

import java.util.ArrayList;
import java.util.List;

@JsonTypeName("Cliente")
public class Cliente extends Usuario{

    @JsonProperty("tipoUsuario")
    private final String tipoUsuario = "Cliente";

    private List<Pedido> pedidos;

    public Cliente() {
    }

    public Cliente(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public Cliente(int id, String nome, ArrayList<Pedido>pedidos) {
        super(id, nome);
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
