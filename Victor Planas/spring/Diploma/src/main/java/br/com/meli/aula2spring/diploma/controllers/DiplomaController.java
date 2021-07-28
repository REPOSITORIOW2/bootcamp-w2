package br.com.meli.aula2spring.diploma.controllers;

import br.com.meli.aula2spring.diploma.dtos.DiplomaDTO;
import br.com.meli.aula2spring.diploma.entities.Aluno;
import br.com.meli.aula2spring.diploma.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/diploma")
public class DiplomaController {
    @Autowired
    AlunoService service;

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public DiplomaDTO addAluno(@RequestBody @Valid Aluno aluno){
        return service.addAluno(aluno);
    }
}
