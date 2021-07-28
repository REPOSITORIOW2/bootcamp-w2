package com.bootcamp.demo.controller;

import com.bootcamp.demo.model.Turn;
import com.bootcamp.demo.service.TurnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Turn")
public class TurnController {
    @Autowired
    TurnService turnService;

    @PostMapping("/add")
    public Turn addTurn(@RequestBody Turn Turn){
        return turnService.addTurn(Turn);
    }

    @GetMapping("/list")
    public List<Turn> getTurnList(){
        return turnService.listAllTurns();
    }

    @PutMapping("/update")
    public Turn updateTurn(@RequestBody Turn Turn){
        return turnService.updateTurn(Turn);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTurnById(@RequestParam Long id){
        turnService.deleteTurnById(id);
    }
}