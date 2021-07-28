package com.example.mongodb.controller;


import com.example.mongodb.model.TurnStatus;
import com.example.mongodb.service.TurnStatusService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/turnStatus")
@RequiredArgsConstructor
public class TurnStatusController {
    private final
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
    public void deleteTurnStatusById(@RequestParam String id){
        turnStatusService.deleteTurnStatusById(id);
    }
}