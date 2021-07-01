package com.bootcampmeli.calculadoraidade.controllers;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class CalculadoraIdadeController{

    public CalculadoraIdadeController() {}

    @GetMapping("{day}/{month}/{year}")
    public Integer calculateAge(@PathVariable Integer day, @PathVariable Integer month, @PathVariable Integer year) {
        Integer years = 0;
        try {
            LocalDate date = LocalDate.of(year, month, day);
            years = Period.between(date, LocalDate.now()).getYears();
        } catch (DateTimeException e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "A data informada é inválida.");
        }
        return years;
    }
  
}