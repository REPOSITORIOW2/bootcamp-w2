package br.com.meli.cliente;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private int id;
    private String nome;
    private long cpf;
    private String email;
    private long telefone;
    private List<Pedido> pedidos;

    public Cliente(int id, String nome, long cpf, String email, long telefone) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        pedidos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public boolean adicionaPedido(Pedido pedido){
        return this.pedidos.add(pedido);
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public String getNome() {
        return nome;
    }

    public long getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public long getTelefone() {
        return telefone;
    }
}
