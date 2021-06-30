package com.bootcampmeli.numerosromanos.controllers;

import com.bootcampmeli.numerosromanos.services.NumeroRomanoService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumerosRomanosController {

    private final NumeroRomanoService numeroRomanoService;

    NumerosRomanosController(NumeroRomanoService numeroRomanoService) {
        this.numeroRomanoService = numeroRomanoService;
    }
    
    @GetMapping("{decimalNumber}")
    public String getRomanNumber(@PathVariable int decimalNumber) {
        if (decimalNumber > 0 && decimalNumber < 5000)
            return numeroRomanoService.convertDecimalNumberToRoman(decimalNumber);
        else
            return "O número precisa ser de 1 a 4999";
    }
}
