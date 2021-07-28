package com.example.mongodb.service;



import com.example.mongodb.model.Dentist;
import com.example.mongodb.repository.DentistRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class DentistService {

    private final DentistRepository dentistRepository;

    public Dentist addDentist(Dentist dentist) {
        return dentistRepository.insert(dentist);
    }

    public List<Dentist> listAllDentists() {
        return dentistRepository.findAll();
    }

    public Dentist updateDentist(Dentist dentist) {
        return dentistRepository.insert(dentist);
    }

    public void deleteDentistById(String id) {
        dentistRepository.deleteById(id);
    }
}