package br.com.meli.aula2spring.diploma.dtos.exception;

import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
public class ErrorDTO {
    protected final String message;
    private final LocalDateTime timeStamp = LocalDateTime.now();

    public ErrorDTO(String message) {
        this.message = message;
    }

}
