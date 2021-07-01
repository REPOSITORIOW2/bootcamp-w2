package com.bootcamp.calcularareacasa.controller;

import com.bootcamp.calcularareacasa.models.Casa;
import com.bootcamp.calcularareacasa.models.Comodo;
import com.bootcamp.calcularareacasa.models.ComodoComArea;
import com.bootcamp.calcularareacasa.services.CalculadoraCasaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/casa")
public class CalculadoraCasaController {

    @Autowired
    public CalculadoraCasaService calculadoraCasaService;


    @GetMapping
    public ResponseEntity<Double> getAreaTotal(@RequestBody Casa casa) {
        return ResponseEntity.ok(calculadoraCasaService.totalMetrosQuadrados(casa.getComodos()));

    }
    @GetMapping
    public ResponseEntity<Double> getValorCasa(@RequestBody Casa casa) {
        return ResponseEntity.ok(calculadoraCasaService.valorDaCasa(casa.getComodos()));
    }

    @GetMapping
    public ResponseEntity<Comodo> getMaiorComodo(@RequestBody Casa casa) {
        return ResponseEntity.ok(calculadoraCasaService.maiorComodo(casa.getComodos()));
    }
    @GetMapping
    public ResponseEntity<ComodoComArea[]> getComodosComArea(@RequestBody Casa casa) {
        return ResponseEntity.ok(calculadoraCasaService.retornarComodosComArea(casa.getComodos()));
    }

}
