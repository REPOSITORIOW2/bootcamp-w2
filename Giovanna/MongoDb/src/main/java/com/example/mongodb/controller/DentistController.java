package com.example.mongodb.controller;


import com.example.mongodb.model.Dentist;
import com.example.mongodb.service.DentistService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dentist")
@RequiredArgsConstructor
public class DentistController {

    private final DentistService dentistService;

    @PostMapping("/add")
    public Dentist addDentist(@RequestBody Dentist dentist) {
        return dentistService.addDentist(dentist);
    }

    @GetMapping("/list")
    public List<Dentist> getDentistList() {
        return dentistService.listAllDentists();
    }

    @PutMapping("/update")
    public Dentist updateDentist(@RequestBody Dentist dentist) {
        return dentistService.updateDentist(dentist);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteDentistById(@RequestParam String id) {
        dentistService.deleteDentistById(id);
    }
}