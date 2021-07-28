package br.com.meli.odontology.odontology.controllers;

import br.com.meli.odontology.odontology.entities.Turn;
import br.com.meli.odontology.odontology.entities.TurnStatus;
import br.com.meli.odontology.odontology.services.TurnStatusService;
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
        return turnStatusService.listAllTurnStatuss();
    }

    @PutMapping("/update")
    public TurnStatus updateTurnStatus(@RequestBody TurnStatus TurnStatus){
        return turnStatusService.updateTurnStatus(TurnStatus);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTurnStatusById(@PathVariable Long id){
        turnStatusService.deleteTurnStatusById(id);
    }

}
