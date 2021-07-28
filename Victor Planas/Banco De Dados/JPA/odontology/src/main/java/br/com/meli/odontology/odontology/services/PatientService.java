package br.com.meli.odontology.odontology.services;

import br.com.meli.odontology.odontology.entities.Patient;
import br.com.meli.odontology.odontology.forms.PatientForm;
import br.com.meli.odontology.odontology.repositories.PatientRepository;
import br.com.meli.odontology.odontology.repositories.TurnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class PatientService {
    @Autowired
    PatientRepository patientRepository;

    @Autowired
    TurnRepository turnRepository;

    public Patient addPatient(PatientForm patient){
        return patientRepository.save(convertForm(patient));
    }

    public Patient updatePatient(PatientForm patient){
        return patientRepository.save(convertForm(patient));
    }

    public List<Patient> listAllPatients(){
        return patientRepository.findAll();
    }

    public void deletePatient(Long id){
        patientRepository.deleteById(id);
    }

    public List<Patient> listAllPatientsByDate(String date){
        final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return patientRepository.findAllByDate(LocalDate.parse(date,dtf));
    }
    private Patient convertForm(PatientForm form){
        return new Patient(form.getName(),form.getLastName(),form.getAddress(),form.getDni(), form.getBirthDate(),form.getPhone(), form.getEmail());

    }

    public Patient setTurns(Long idPatient, List<Long> turns) {
        var patient = patientRepository.findById(idPatient).orElseThrow();
        var turnList = turnRepository.findAllById(turns);

        patient.setTurns(turnList);
        return patient;
    }
}
