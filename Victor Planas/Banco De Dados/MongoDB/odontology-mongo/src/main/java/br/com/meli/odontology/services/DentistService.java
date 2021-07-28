package br.com.meli.odontology.services;

import br.com.meli.odontology.entities.Dentist;
import br.com.meli.odontology.forms.DentistForm;
import br.com.meli.odontology.repositories.DentistMongoRepository;
import br.com.meli.odontology.repositories.DiaryMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DentistService {
    @Autowired
    DentistMongoRepository dentistMongoRepository;

    @Autowired
    DiaryMongoRepository diaryMongoRepository;

    public Dentist addDentist(DentistForm dentist) {
        return dentistMongoRepository.save(convertForm(dentist));
    }

    public List<Dentist> listAllDentists() {
        return dentistMongoRepository.findAll();
    }

    public Dentist updateDentist(DentistForm dentist) {
        return dentistMongoRepository.save(convertForm(dentist));
    }

    public void deleteDentistById(String id) {
        dentistMongoRepository.deleteById(id);
    }

//    public List<Dentist> listDentistsMoreThanTwoTurnsByDate(String date){
//        final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        return dentistRepository.listDentistsMoreThanTwoTurnsByDate(LocalDate.parse(date,dtf));
//    }
//
//    public List<DentistSchedule> listAllAppointments(DentistForm dentist) {
//        return dentistRepository.listAllAppointments(convertForm(dentist));
//    }
//
    private Dentist convertForm(DentistForm form){
        return  new Dentist(
                form.getName(),
                form.getLastName(),
                form.getAddress(),
                form.getDni(),
                form.getBirthDate(),
                form.getPhone(),
                form.getEmail(),
                form.getCodeMp());
    }
//
//    public Dentist setDiaries(List<Long> diaries, Long idDentist) {
//        var dentist = dentistRepository.findById(idDentist).orElseThrow();
//        var diariesList = diaryRepository.findAllById(diaries);
//
//        dentist.setDiaries(diariesList);
//        return dentist;
//    }
}
