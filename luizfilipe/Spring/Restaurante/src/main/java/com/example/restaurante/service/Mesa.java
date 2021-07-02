package com.example.restaurante.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@Getter
@Setter
public class Mesa {
    private List<Pedido> pedidosList;

    public Mesa() {
        this.pedidosList = new ArrayList<Pedido>();
    }
}
