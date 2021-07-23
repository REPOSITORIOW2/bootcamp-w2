package com.example.mongodb.controller;


import com.example.mongodb.model.Turn;
import com.example.mongodb.service.TurnService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Turn")
@RequiredArgsConstructor
public class TurnController {
    private final
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
    public void deleteTurnById(@RequestParam String id){
        turnService.deleteTurnById(id);
    }
}