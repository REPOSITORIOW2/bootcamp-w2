package dev.feldmann.bootcamp.modulo6.restaurante.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RestauranteInfoDTO {

    private Double dinheiroNoCaixa;
    private Double dinheiroAReceber;
    private Long mesasComPedidos;
    private Long mesasVazias;


}
