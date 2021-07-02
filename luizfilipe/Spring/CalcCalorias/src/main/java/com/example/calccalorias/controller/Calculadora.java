package com.example.calccalorias.controller;

import com.example.calccalorias.model.dao.AlimentosDTO;
import com.example.calccalorias.model.service.CalculadoraImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/calorias")
public class Calculadora {

    @Autowired
    private CalculadoraImple calc;

    @GetMapping("/all")
    public List<AlimentosDTO> getAll() {
        return calc.getAllFoods();
    }

    @GetMapping("/simple/{id}")
    public AlimentosDTO getByID(@PathVariable Integer id) {
        return calc.getFoodsByID(id);
    }
}
