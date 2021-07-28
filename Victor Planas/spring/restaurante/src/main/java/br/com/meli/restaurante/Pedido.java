package br.com.meli.restaurante;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;
import java.util.List;

public class Pedido{
    private int id;
    @JsonIgnore
    private Mesa mesa;
    private List<Prato> pratos;
    private double valorTotal;
    private boolean ativo;
    private Date data;

    public Pedido(int id, Mesa mesa, List<Prato> pratos) {
        this.id = id;
        this.mesa = mesa;
        this.pratos = pratos;
    }

    public long getId() {
        return id;
    }

    public List<Prato> getPratos() {
        return pratos;
    }

    public double getValorTotal() {
        double consumo = 0;
        for (Prato prato : this.pratos) {
            consumo += prato.getPreco()*prato.getQuantidade();
        }
        this.valorTotal = consumo;
        return valorTotal;
    }

    public Mesa getMesa() {
        return this.mesa;
    }
}
