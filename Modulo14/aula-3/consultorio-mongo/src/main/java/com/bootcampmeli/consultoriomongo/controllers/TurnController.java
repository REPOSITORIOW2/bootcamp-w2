package com.bootcampmeli.consultoriomongo.controllers;

import java.util.List;

import com.bootcampmeli.consultoriomongo.dtos.UpsertTurnDTO;
import com.bootcampmeli.consultoriomongo.entities.Turn;
import com.bootcampmeli.consultoriomongo.services.TurnService;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("turns")
public class TurnController {

    private final TurnService turnService;


    public TurnController(TurnService turnService) {
        this.turnService = turnService;
    }

    @GetMapping
    public List<Turn> getAllTurns() {
        return this.turnService.getAllTurns();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Turn createTurn(@RequestBody UpsertTurnDTO upsertTurnDTO) {
        return this.turnService.createTurn(upsertTurnDTO);
    }

    @GetMapping("/dentist/{lastName}")
    public List<Turn> getTurnsByDentistLastName(@PathVariable String lastName) {
        return this.turnService.getTurnsByDentistLastName(lastName);
    }

    @GetMapping("/status/{status}")
    public List<Turn> getTurnByStatus(@PathVariable String status) {
        return this.turnService.getTurnWithStatus(status);
    }

}
