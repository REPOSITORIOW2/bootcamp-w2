package com.bootcamp.demo.controller;

import com.bootcamp.demo.model.TurnStatus;
import com.bootcamp.demo.service.TurnStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/turnStatus")
public class TurnStatusController {
    @Autowired
    TurnStatusService turnStatusService;

    @PostMapping("/add")
    public TurnStatus addTurnStatus(@RequestBody TurnStatus TurnStatus){
        return turnStatusService.addTurnStatus(TurnStatus);
    }

    @GetMapping("/list")
    public List<TurnStatus> getTurnStatusList(){
        return turnStatusService.listAllTurnStatus();
    }

    @PutMapping("/update")
    public TurnStatus updateTurnStatus(@RequestBody TurnStatus TurnStatus){
        return turnStatusService.updateTurnStatus(TurnStatus);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTurnStatusById(@RequestParam Long id){
        turnStatusService.deleteTurnStatusById(id);
    }
}