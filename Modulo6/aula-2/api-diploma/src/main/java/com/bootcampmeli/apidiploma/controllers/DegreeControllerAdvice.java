package com.bootcampmeli.apidiploma.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.server.ResponseStatusException;

@RestControllerAdvice
public class DegreeControllerAdvice {


    @ExceptionHandler(ResponseStatusException.class)
    public ResponseEntity<?> handleException(ResponseStatusException ex){
        return new ResponseEntity<>(ex.getReason(), ex.getStatus());
    }
    
}
