package dev.feldmann.bootcamp.modulo6.restaurante.dto;

import dev.feldmann.bootcamp.modulo6.restaurante.entity.Pedido;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class MesaDTO {
    private Double total;
    private List<Pedido> pedidos;
}
