package com.bootcampmeli.apiprodutos.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.server.ResponseStatusException;

@RestControllerAdvice
public class ControllerAdvisor {
    @ExceptionHandler(ResponseStatusException.class)
    public ResponseEntity handleException(ResponseStatusException e) {
        return new ResponseEntity(e.getReason(), e.getStatus());
    }
}