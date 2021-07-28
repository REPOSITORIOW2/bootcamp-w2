package br.com.meli.odontology.odontology.services;

import br.com.meli.odontology.odontology.entities.Dentist;
import br.com.meli.odontology.odontology.forms.DentistForm;
import br.com.meli.odontology.odontology.repositories.DentistRepository;
import br.com.meli.odontology.odontology.repositories.DiaryRepository;
import br.com.meli.odontology.odontology.responses.DentistSchedule;
import org.apache.tomcat.jni.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class DentistService {
    @Autowired
    DentistRepository dentistRepository;

    @Autowired
    DiaryRepository diaryRepository;

    public Dentist addDentist(DentistForm dentist) {
        return dentistRepository.save(convertForm(dentist));
    }

    public List<Dentist> listAllDentists() {
        return dentistRepository.findAll();
    }

    public Dentist updateDentist(DentistForm dentist) {
        return dentistRepository.save(convertForm(dentist));
    }

    public void deleteDentistById(Long id) {
        dentistRepository.deleteById(id);
    }

    public List<Dentist> listDentistsMoreThanTwoTurnsByDate(String date){
        final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return dentistRepository.listDentistsMoreThanTwoTurnsByDate(LocalDate.parse(date,dtf));
    }

    public List<DentistSchedule> listAllAppointments(DentistForm dentist) {
        return dentistRepository.listAllAppointments(convertForm(dentist));
    }

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

    public Dentist setDiaries(List<Long> diaries, Long idDentist) {
        var dentist = dentistRepository.findById(idDentist).orElseThrow();
        var diariesList = diaryRepository.findAllById(diaries);

        dentist.setDiaries(diariesList);
        return dentist;
    }
}
