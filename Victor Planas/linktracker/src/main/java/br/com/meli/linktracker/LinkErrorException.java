package br.com.meli.linktracker;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Url invalida") //400
public class LinkErrorException extends RuntimeException{
    public LinkErrorException(String message) {
        super(message);
    }
}
