package com.example.mongodb.controller;


import com.example.mongodb.model.Patient;
import com.example.mongodb.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
@RequiredArgsConstructor
public class PatientController {
    private final
    PatientService patientService;

    @PostMapping("/add")
    public Patient addPatient(@RequestBody Patient patient){
        return patientService.addPatient(patient);
    }

    @GetMapping("/list")
    public List<Patient> getPatientList(){
        return patientService.listAllPatients();
    }

    @PutMapping("/update")
    public Patient updatePatient(@RequestBody Patient patient){
        return patientService.updatePatient(patient);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePatientById(@RequestParam String id){
        patientService.deletePatient(id);
    }
}
