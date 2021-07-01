package com.example.apicalculadoradeidade.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Period;

@RestController
@RequestMapping("/")
public class AgeController {

    @GetMapping("{day}/{moth}/{year}")
    public Integer calculeAge(@PathVariable Integer day, @PathVariable Integer moth, @PathVariable Integer year) {
        LocalDate data = LocalDate.of(year, moth, day);
        Period difference = Period.between(data, LocalDate.now());

        return difference.getYears();
    }
}
