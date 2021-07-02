package dev.feldmann.bootcamp.modulo6.restaurante.forms;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

@Data
public class PedidoForm {

    @Valid
    @NotEmpty
    private List<Prato> pratos;

    @Data
    public static class Prato {
        @NotNull
        @NotEmpty
        private String nome;
        @NotNull
        @Min(1)
        private Integer quantidade;
        @NotNull
        @DecimalMin("0.01")
        private BigDecimal preco;
        @NotNull
        @NotEmpty
        private String description;
    }
}
