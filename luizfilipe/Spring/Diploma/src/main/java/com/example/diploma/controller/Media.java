package com.example.diploma.controller;

import com.example.diploma.service.Aluno;
import com.example.diploma.service.ResultadoAluno;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nota")
public class Media {

    @PostMapping
    public ResponseEntity<ResultadoAluno> resultado(@RequestBody Aluno aluno) {
        return ResponseEntity.ok(aluno.media());
    }
}
