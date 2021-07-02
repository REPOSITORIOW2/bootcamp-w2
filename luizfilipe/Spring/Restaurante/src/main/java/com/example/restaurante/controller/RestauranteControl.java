package com.example.restaurante.controller;

import com.example.restaurante.service.Mesa;
import com.example.restaurante.service.Restaurante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/restaurante")
public class RestauranteControl {

    @Autowired
    private Restaurante rest;

    @GetMapping("/caixa")
    public ResponseEntity<Map<String, Double>> totalCaixa() {
        return ResponseEntity.ok(rest.totalCaixa());
    }

    @GetMapping("/totalpedidos")
    public ResponseEntity<Map<String, List<Mesa>>> totalPedidos() {
        return ResponseEntity.ok(rest.actualRestaurante());
    }

    @GetMapping("/mesa{id}")
    public ResponseEntity<Mesa> pedidoMesa(@PathVariable Integer id) {
        return ResponseEntity.ok(rest.pedidoMesa(id));
    }

    @GetMapping("/pagar{id}")
    public ResponseEntity<Map<String, String>> pagarMesa(@PathVariable Integer id) {
        return ResponseEntity.ok(rest.pagarMesa(id));
    }
}
