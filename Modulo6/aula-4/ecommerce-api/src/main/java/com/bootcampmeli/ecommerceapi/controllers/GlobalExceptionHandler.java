package com.bootcampmeli.ecommerceapi.controllers;

import com.bootcampmeli.ecommerceapi.dtos.ExceptionDTO;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.server.ResponseStatusException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResponseStatusException.class)
    public ResponseEntity<ExceptionDTO> handleException(ResponseStatusException ex) {
        return new ResponseEntity<ExceptionDTO>(new ExceptionDTO(ex.getReason()), ex.getStatus());
    }
}
