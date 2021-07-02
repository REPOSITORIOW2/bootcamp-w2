package com.meli.calculadoracalorias.controller;

import com.meli.calculadoracalorias.entity.Food;
import com.meli.calculadoracalorias.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/foods")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @GetMapping
    public ResponseEntity<List<Food>> listaIngredientes() {
        return new ResponseEntity<>(foodService.getList(), HttpStatus.OK);
    }

    @GetMapping("/{nome}")
    public ResponseEntity<Food> obterIngrediente(@PathVariable String nome) {
        return new ResponseEntity<>(foodService.getFood(nome), HttpStatus.OK);
    }

}
