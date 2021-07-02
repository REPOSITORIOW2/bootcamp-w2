package com.example.restaurante.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@AllArgsConstructor
@Getter
@Setter
public class Pedido {
    private Integer id;
    private List<Pratos> pratosList;
}
