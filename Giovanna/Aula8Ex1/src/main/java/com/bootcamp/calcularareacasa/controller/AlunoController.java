package com.bootcamp.calcularareacasa.controller;


import com.bootcamp.calcularareacasa.models.Aluno;
import com.bootcamp.calcularareacasa.models.Casa;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @GetMapping
    public ResponseEntity<String> getMensagemAprovacao(@RequestBody Aluno aluno) {
        var mediaGeral = aluno.calcularMedia();
        return ResponseEntity.ok(mediaGeral < 9?
                aluno.getNome() + " conseguiu a media geral " + mediaGeral
                :aluno.getNome() + " conseguiu a media geral " + mediaGeral + ".Parabens!!!" );

    }
}
