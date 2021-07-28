package br.com.meli.aula2spring.diploma.dtos.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
public class ValidationErrorDTO extends ErrorDTO {
    Map<String, String> erros = new HashMap<>();


    public ValidationErrorDTO(String message) {
        super(message);
    }

    public void addError(String field, String message){
        erros.put(field,message);
    }
}
