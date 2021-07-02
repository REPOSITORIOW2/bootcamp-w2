package com.example.restaurante.service;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Pratos {
    private Integer id;
    private Double preco;
    private String descricao;
    private Integer quantidade;
}
