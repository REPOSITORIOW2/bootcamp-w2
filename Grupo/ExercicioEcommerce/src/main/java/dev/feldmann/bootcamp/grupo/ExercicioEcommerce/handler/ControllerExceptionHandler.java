package dev.feldmann.bootcamp.grupo.ExercicioEcommerce.handler;

import dev.feldmann.bootcamp.grupo.ExercicioEcommerce.exceptions.ItemNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ControllerExceptionHandler {
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "Produto nao encontrado") // 500
    @ExceptionHandler(ItemNotFoundException.class)
    public void trataErro(){

    }
}
