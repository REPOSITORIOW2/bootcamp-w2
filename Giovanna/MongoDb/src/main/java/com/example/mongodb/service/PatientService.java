package com.example.mongodb.service;


import com.example.mongodb.model.Patient;
import com.example.mongodb.repository.PatientRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class PatientService {
    private final
    PatientRepository patientRepository;

    public Patient addPatient(Patient patient){
        return patientRepository.insert(patient);
    }

    public Patient updatePatient(Patient patient){
        return patientRepository.insert(patient);
    }

    public List<Patient> listAllPatients(){
        return patientRepository.findAll();
    }

    public void deletePatient(String id){
        patientRepository.deleteById(id);
    }
}