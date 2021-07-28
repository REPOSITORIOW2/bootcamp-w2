package com.bootcamp.demo.controller;

import com.bootcamp.demo.model.Patient;
import com.bootcamp.demo.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {
    @Autowired
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
    public void deletePatientById(@RequestParam Long id){
        patientService.deletePatient(id);
    }
}
