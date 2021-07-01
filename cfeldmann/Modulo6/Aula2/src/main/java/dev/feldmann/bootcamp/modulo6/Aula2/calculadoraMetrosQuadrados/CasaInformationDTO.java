package dev.feldmann.bootcamp.modulo6.Aula2.calculadoraMetrosQuadrados;

import lombok.Data;
import lombok.NonNull;

import java.util.Map;


@Data
public class CasaInformationDTO {
    @NonNull
    private Double totalArea;
    @NonNull
    private Double value;
    @NonNull
    private String largestComodo;
    @NonNull
    private Map<String,Double> areaByComodo;
}
