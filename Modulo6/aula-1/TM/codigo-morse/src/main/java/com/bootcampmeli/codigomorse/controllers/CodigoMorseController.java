package com.bootcampmeli.codigomorse.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.bootcampmeli.codigomorse.services.CodigoMorseService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class CodigoMorseController {
    private final CodigoMorseService codigoMorseService;

    public CodigoMorseController(CodigoMorseService codigoMorseService) {
        this.codigoMorseService = codigoMorseService;
    }

    @GetMapping("{phrase}")
    public String getMethodName(@PathVariable String phrase) {
        return codigoMorseService.translate(phrase).toUpperCase();
    }
}