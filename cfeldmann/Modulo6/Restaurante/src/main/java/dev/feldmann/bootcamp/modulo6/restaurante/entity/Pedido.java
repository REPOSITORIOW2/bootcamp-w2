package dev.feldmann.bootcamp.modulo6.restaurante.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Pedido {

    private static long lastId = 100;

    private Long id;
    @JsonIgnore
    private Mesa mesa;
    private List<Prato> pratos;

    public Pedido(Mesa mesa) {
        this.id = lastId++;
        this.mesa = mesa;
        this.pratos = new ArrayList<>();
    }

    public Double calculateTotalPrice() {
        return pratos.stream().mapToDouble(Prato::calculateTotalPrice).sum();
    }

    public void addPrato(Prato prato) {
        this.pratos.add(prato);
    }


}
