package dev.feldmann.bootcamp.modulo6.Aula2.calculadoraIdade;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IdadeDTO {

    private Long idade;
    private String error;


    public static IdadeDTO fromError(Exception ex) {
        return new IdadeDTO(null, ex.getLocalizedMessage());
    }

    public static IdadeDTO fromIdade(long idade) {
        return new IdadeDTO(idade, null);
    }

}
