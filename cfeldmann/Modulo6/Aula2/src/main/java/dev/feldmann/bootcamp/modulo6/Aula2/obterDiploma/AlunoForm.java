package dev.feldmann.bootcamp.modulo6.Aula2.obterDiploma;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.util.List;

@Data
public class AlunoForm {

    @NotEmpty
    @NotNull
    @Size(min = 3)
    private String nome;

    @Valid
    @NotNull
    @Size(min = 1)
    private List<Disciplina> disciplinas;


    @Data
    static class Disciplina {
        @NotNull
        @NotEmpty
        private String nome;

        @NotNull
        @DecimalMin("0.0")
        @DecimalMax("10.0")
        private BigDecimal nota;

    }

    public double getAverageGrade() {
        return disciplinas.stream()
                .mapToDouble(d -> d.getNota().doubleValue())
                .average()
                .orElse(0);
    }

}
