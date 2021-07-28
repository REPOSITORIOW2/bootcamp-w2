package br.com.meli.odontology.services;

import br.com.meli.odontology.entities.Patient;
import br.com.meli.odontology.forms.PatientForm;
import br.com.meli.odontology.repositories.PatientMongoRepository;
import br.com.meli.odontology.repositories.TurnMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    @Autowired
    PatientMongoRepository patientMongoRepository;

    @Autowired
    TurnMongoRepository turnMongoRepository;

    public Patient addPatient(PatientForm patient){
        return patientMongoRepository.save(convertForm(patient));
    }

    public Patient updatePatient(PatientForm patient){
        return patientMongoRepository.save(convertForm(patient));
    }

    public List<Patient> listAllPatients(){
        return patientMongoRepository.findAll();
    }

    public void deletePatient(String id){
        patientMongoRepository.deleteById(id);
    }

//    public List<Patient> listAllPatientsByDate(String date){
//        final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        return patientRepository.findAllByDate(LocalDate.parse(date,dtf));
//    }
    private Patient convertForm(PatientForm form){
        return new Patient(form.getName(),form.getLastName(),form.getAddress(),form.getDni(), form.getBirthDate(),form.getPhone(), form.getEmail());

    }
//
//    public Patient setTurns(Long idPatient, List<Long> turns) {
//        var patient = patientRepository.findById(idPatient).orElseThrow();
//        var turnList = turnRepository.findAllById(turns);
//
//        patient.setTurns(turnList);
//        return patient;
//    }
}
