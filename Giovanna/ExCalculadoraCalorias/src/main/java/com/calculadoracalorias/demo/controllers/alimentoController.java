package com.calculadoracalorias.demo.controllers;


import com.calculadoracalorias.demo.models.alimentoModel;
import com.calculadoracalorias.demo.services.alimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/alimento")
public class alimentoController {
    @Autowired
    alimentoService service;

    @GetMapping("/listar")
    public List<alimentoModel> listaTodos(){
        return service.lista();
    }

    @GetMapping("/getByNome/{nome}")
    public alimentoModel getByNome(@PathVariable String nome){
        return service.findAlimentoByName(nome);
    }
}
