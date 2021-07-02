package dev.feldmann.bootcamp.modulo6.restaurante.entity;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
public class Prato {

    private static long lastId = 100;

    private Long id;
    private Double price;
    private String description;
    private Integer amount;


    public Prato(Double price, String description, Integer amount) {
        this.id = lastId++;
        this.price = price;
        this.description = description;
        this.amount = amount;
    }

    public Double calculateTotalPrice() {
        return price * amount;
    }
}

