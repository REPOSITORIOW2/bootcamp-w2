package br.com.meli.aula2spring.diploma.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class DiplomaDTO {
    private String message;
    private double average;
    private StudentDTO student;
}
