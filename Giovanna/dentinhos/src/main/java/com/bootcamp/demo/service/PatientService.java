package com.bootcamp.demo.service;

import com.bootcamp.demo.model.Patient;
import com.bootcamp.demo.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    @Autowired
    PatientRepository patientRepository;

    public Patient addPatient(Patient patient){
        return patientRepository.save(patient);
    }

    public Patient updatePatient(Patient patient){
        return patientRepository.save(patient);
    }

    public List<Patient> listAllPatients(){
        return patientRepository.findAll();
    }

    public void deletePatient(Long id){
        patientRepository.deleteById(id);
    }
}