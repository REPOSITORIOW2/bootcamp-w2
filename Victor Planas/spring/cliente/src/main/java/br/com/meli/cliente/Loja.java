package br.com.meli.cliente;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    private List<Cliente> clientes;
    private int numPedidos;


    public Loja() {
        this.clientes = new ArrayList<Cliente>();
    }

    public Cliente adicionaCliente(Cliente cliente){
        Cliente novo = new Cliente(cliente.getId(),cliente.getNome(),cliente.getCpf(),cliente.getEmail(),cliente.getTelefone());
        this.clientes.add(cliente);
        return cliente;
    }

    public Cliente getClienteById(int id){
        for (Cliente cliente : clientes) {
            if(cliente.getId() == id) return cliente;
        }
        return null;
    }

    public int getNumPedidos() {
        numPedidos++;
        return numPedidos;
    }


}
