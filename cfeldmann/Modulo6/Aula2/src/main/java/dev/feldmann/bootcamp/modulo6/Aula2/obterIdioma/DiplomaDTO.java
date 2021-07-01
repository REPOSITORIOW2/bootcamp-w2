package dev.feldmann.bootcamp.modulo6.Aula2.obterIdioma;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class DiplomaDTO {
    private String aluno;
    private boolean aprovado;
    private Double media;
    private String mensagem;

}
