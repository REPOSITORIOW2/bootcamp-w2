package br.com.meli.odontology.odontology.controllers;

import br.com.meli.odontology.odontology.entities.Dentist;
import br.com.meli.odontology.odontology.entities.Turn;
import br.com.meli.odontology.odontology.forms.TurnForm;
import br.com.meli.odontology.odontology.services.TurnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/Turn")
public class TurnController {
    @Autowired
    TurnService turnService;

    @PostMapping("/add")
    public Turn addTurn(@RequestBody TurnForm Turn){
        return turnService.addTurn(Turn);
    }

    @GetMapping("/list")
    public List<Turn> getTurnList(){
        return turnService.listAllTurns();
    }

    @PutMapping("/update")
    public Turn updateTurn(@RequestBody TurnForm Turn){
        return turnService.updateTurn(Turn);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTurnById(@PathVariable Long id){
        turnService.deleteTurnById(id);
    }

    @GetMapping("/listAllFinishedTurn")
    public List<Turn> listAllTurnsFinishedStatus(){
        return turnService.listAllTurnsByStatus(1L);
    }

    @GetMapping("/listAllPendingTurn/{date}")
    public List<Turn> listAllTurnsPendingStatus(@PathVariable String date){
        return turnService.listAllTurnsByStatusByDate(3L, date);
    }

    @GetMapping("/listAllReescheduled")
    public List<Turn> listAllReescheduled(){
        return turnService.listAllTurnsByStatus(4L);
    }

    @GetMapping("/listAllReescheduledByDentist")
    public List<Turn> listAllReescheduledByDentist(@RequestBody Dentist dentist){
        return turnService.listAllTurnsByStatusByDentist(dentist);
    }

    @PutMapping("/reschedule/{idTurn}}")
    public void reeschedule(@RequestBody Turn newTurn, @PathVariable Long idTurn){
        turnService.reeschedule(idTurn, newTurn);
    }

    @PostMapping("/setDiary/{idTurn}/{idDiary}")
    public Turn setDiary(@PathVariable Long idTurn, @PathVariable Long idDiary){
        return turnService.setDiary(idTurn,idDiary);
    }

    @PostMapping("/setStatus/{idTurn}/{idStatus}")
    public Turn setStatus(@PathVariable Long idTurn, @PathVariable Long idStatus){
        return turnService.setStatus(idTurn,idStatus);
    }
    @PostMapping("/setPatient/{idTurn}/{idPatient}")
    public Turn setPatient(@PathVariable Long idTurn, @PathVariable Long idPatient){
        return turnService.setPatient(idTurn,idPatient);
    }

}
