package com.bootcamp.restaurantecrud;

import java.util.ArrayList;
import java.util.List;

public class Mesa {
    private long id;
    private List<Pedido> pedidos;
    private double valorTotalConsumido;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public double getValorTotalConsumido() {
        return valorTotalConsumido;
    }

    public void setValorTotalConsumido(double valorTotalConsumido) {
        this.valorTotalConsumido = valorTotalConsumido;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public Mesa(long id) {
        this.id = id;
        this.pedidos = new ArrayList<Pedido>();
    }
    public void calcularValorTotal(){
        double result = 0;
        for(int i=0; i < pedidos.size(); i++){
            result+= pedidos.get(i).getValorTotal();
        }
        this.valorTotalConsumido = result;
    }
    public void adicionarPedido(Pedido pedido){
        pedidos.add(pedido);
    }
    public void limparMesa(){
        this.id = this.id;
        this.pedidos = new ArrayList<Pedido>();
        this.valorTotalConsumido = 0;
    }
    @Override
    public String toString() {
        String result = "";
        result +="Mesa" +
                " id" + id +
                "Consumiu: ";
        for(int i=0; i < pedidos.size(); i++){
            result+= pedidos.get(i).toString();
        }
        result += "\n totalizando: " + valorTotalConsumido;
        return result;
    }
}
