package dev.feldmann.bootcamp.modulo6.Aula2.calculadoraMetrosQuadrados;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;


@Data
public class CasaForm {

    @NotEmpty
    private String nome;
    @NotEmpty
    private String endereco;
    @NotNull
    @Valid
    @Size(min = 1)
    private List<Comodo> comodos;

    @Data
    static class Comodo {
        @NotEmpty
        private String nome;
        @NotNull
        private Double largura;
        @NotNull
        private Double comprimento;


        public double getArea() {
            return largura * comprimento;
        }
    }
}


