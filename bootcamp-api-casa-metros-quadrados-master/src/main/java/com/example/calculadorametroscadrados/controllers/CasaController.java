package com.example.calculadorametroscadrados.controllers;

import com.example.calculadorametroscadrados.dao.CasaDAO;
import com.example.calculadorametroscadrados.dto.CasaDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/casas")
public class CasaController {

    @GetMapping()
    public ResponseEntity<?> index() {
        return ResponseEntity.ok(CasaDAO.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> show(@PathVariable long id) {
        CasaDTO casa = CasaDAO.findById(id);

        if (casa != null) {
            return ResponseEntity.ok(casa);
        }

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Casa não encontrada");
    }

    @PostMapping
    public ResponseEntity<?> store(@RequestBody CasaDTO casa) {
        return ResponseEntity.status(HttpStatus.CREATED).body(CasaDAO.add(casa));
    }

    @PutMapping()
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody CasaDTO casa) {
        CasaDTO novaCasa = CasaDAO.update(id, casa);

        if (novaCasa != null) {
            return ResponseEntity.ok(novaCasa);
        }

        return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Casa não encontrada");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCarById(@PathVariable long id) {
        CasaDTO casa = CasaDAO.delete(id);

        if(casa != null) {
            return ResponseEntity.ok(casa);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Casa não encontrada.");
        }
    }
}
