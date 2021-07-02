package br.com.meli.restaurante;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private List<Mesa> mesas;
    private int numeroDeMesas;
    private int numeroPedido;
    private double caixa;

    public Restaurante() {
        this.mesas = new ArrayList<Mesa>();
    }

    public void setCaixa(double caixa) {
        this.caixa = caixa;
    }

    public double getCaixa() {
        return caixa;
    }

    public Mesa adicionaMesa(){
        Mesa mesa = new Mesa(numeroDeMesas);
        this.mesas.add(mesa);
        numeroDeMesas++;
        return mesa;
    }

    public Mesa getMesaByID(Integer id){
        for (Mesa mesa : mesas) {
            if(mesa.getId() == id) return mesa;
        }
        return null;
    }

    public int getNumeroPedido(){
        this.numeroPedido++;
        return numeroPedido;
    }
}
