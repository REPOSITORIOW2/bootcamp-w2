package br.com.meli.bootcamp30_06.controller;

import br.com.meli.bootcamp30_06.services.NumerosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(value = "/api/numeros")
public class NumerosController {

    @Autowired
    NumerosService numerosService;

    @GetMapping("/converter/{numero}")
    public ResponseEntity<Map<String, Object>> converterNumero(@PathVariable(value = "numero") int numero) {
        return ResponseEntity.ok(Map.of("Numero_convertido", numerosService.converteParaRomano(numero)));
    }
}
