package com.bootcamp.consultorio.controllers;

import java.time.LocalDate;
import java.util.List;

import com.bootcamp.consultorio.entities.Dentist;
import com.bootcamp.consultorio.entities.Diary;
import com.bootcamp.consultorio.entities.Patient;
import com.bootcamp.consultorio.entities.Turn;
import com.bootcamp.consultorio.services.ConsultorioService;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ConsultorioController {

    private final ConsultorioService consultorioService;


    public ConsultorioController(ConsultorioService consultorioService) {
        this.consultorioService = consultorioService;
    }

    @GetMapping("patients")
    public List<Patient> getAllPatients() {
        return this.consultorioService.getAllPatients();
    }

    @GetMapping("exercicio1/{day}")
    public List<Patient> getAllPatientsOfTheDay(
            @PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate day) {
        return this.consultorioService.getAllPatientsOfTheDay(day);
    }

    @GetMapping("exercicio2/{day}")
    public List<Dentist> getAllDentistsWithMoreThanTwoTurns(
            @PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate day) {
        return this.consultorioService.getAllDentistsWithMoreThanTwoTurns(day);
    }

    @GetMapping("exercicio3")
    public List<Turn> getAllCompletedTurns() {
        return this.consultorioService.findAllCompletedTurns();
    } 

    @GetMapping("exercicio4/{day}")
    public List<Turn> getTurnsWithPendingStatusInASpecificDay(
            @PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate day) {
        return this.consultorioService.getTurnsWithPendingStatusInASpecificDay(day);
    }

    @GetMapping("exercicio5/{dentistId}")
    public List<Diary> getDairyOfDentist(@PathVariable Long dentistId) {
        return this.consultorioService.getDiaryOfADentist(dentistId);
    }

    @GetMapping("exercicio6/{dentistId}")
    public List<Turn> getAllRescheduledTurns(@PathVariable Long dentistId) {
        return this.consultorioService.getAllRescheduledTurns(dentistId);
    }
}
