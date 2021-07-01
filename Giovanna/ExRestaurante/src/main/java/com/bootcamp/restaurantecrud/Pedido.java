package com.bootcamp.restaurantecrud;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pedido {
    private long id;
    private long Idmesa;
    private List<Prato> pratos;
    private double valorTotal;
    private static long nextid = 0;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdmesa() {
        return Idmesa;
    }

    public void setIdmesa(long idmesa) {
        Idmesa = idmesa;
    }

    public void setPratos(List<Prato> pratos) {
        this.pratos = pratos;
    }

    public List<Prato> getPratos() {
        return pratos;
    }

    public void setPratos(ArrayList<Prato> pratos) {
        this.pratos = pratos;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        String result = "";
        for(int i=0; i < pratos.size(); i++){
            result+= pratos.get(i).toString();
        }
        return result;
    }
    public Pedido(Pedido pedido){
        this.id = nextid;
        this.pratos = pedido.getPratos();
        this.valorTotal = pedido.getValorTotal();
        this.Idmesa = pedido.getIdmesa();
    }
}
