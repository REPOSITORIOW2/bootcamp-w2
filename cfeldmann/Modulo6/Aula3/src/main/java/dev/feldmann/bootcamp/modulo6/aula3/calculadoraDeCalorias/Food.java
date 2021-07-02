package dev.feldmann.bootcamp.modulo6.aula3.calculadoraDeCalorias;

import com.fasterxml.jackson.annotation.JsonInclude;
import dev.feldmann.bootcamp.common.jsonRepository.Identifiable;
import lombok.Data;
import lombok.Getter;

import java.util.List;

@Data
public class Food {
    private String name;
    private Integer calories;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Ingredient> ingredients;
}
