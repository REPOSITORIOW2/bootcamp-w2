package com.bootcamp.calcularareacasa.controller;


import com.bootcamp.calcularareacasa.models.Casa;
import com.bootcamp.calcularareacasa.services.CalculadoraCasaService;
import com.bootcamp.calcularareacasa.services.CalculadoraIdadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;


@RestController
@RequestMapping("/idade")
public class CalculadoraIdadeController {

    @Autowired
    private CalculadoraIdadeService service;

    @GetMapping("/{dia}/{mes}/{ano}")
    public ResponseEntity<Integer> getIdade(@PathVariable int dia, @PathVariable int mes, @PathVariable  int ano) {
        LocalDate aniversario = LocalDate.of(ano,mes, dia);
        return ResponseEntity.ok(service.calculaIdade(aniversario,LocalDate.now()));
    }

}
