package br.com.meli.restaurante;

import java.util.ArrayList;
import java.util.List;

public class Mesa {
    private int id;
    private List<Pedido> pedidos = new ArrayList<>();
    private double valorTotal;


    public Mesa(int id) {
        this.id = id;
        this.pedidos = new ArrayList<>();
        this.valorTotal = 0;
    }

    public List<Pedido> getListaPedidos(){
        return this.pedidos;
    }

    public double consumoTotal(){
        double consumo = 0;
        for (Pedido pedido : this.pedidos) {
            consumo += pedido.getValorTotal();
        }
        this.valorTotal = consumo;
        return consumo;
    }

    public double fechaMesa() {
        consumoTotal();
        pedidos.clear();

        return this.valorTotal;
    }

    public List<Pedido> adicionaPedido(Pedido p){
        pedidos.add(p);
        return this.pedidos;
    }


    public int getId() {
        return id;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

}
