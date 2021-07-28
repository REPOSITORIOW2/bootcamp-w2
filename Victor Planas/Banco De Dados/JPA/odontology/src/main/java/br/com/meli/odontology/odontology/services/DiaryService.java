package br.com.meli.odontology.odontology.services;

import br.com.meli.odontology.odontology.entities.Diary;
import br.com.meli.odontology.odontology.forms.DiaryForm;
import br.com.meli.odontology.odontology.repositories.DentistRepository;
import br.com.meli.odontology.odontology.repositories.DiaryRepository;
import br.com.meli.odontology.odontology.repositories.TurnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiaryService {
    @Autowired
    DiaryRepository diaryRepository;

    @Autowired
    DentistRepository dentistRepository;

    @Autowired
    TurnRepository turnRepository;

    public Diary addDiary(DiaryForm Diary) {

        return diaryRepository.save(convertForm(Diary));
    }

    public List<Diary> listAllDiarys() {
        return diaryRepository.findAll();
    }

    public Diary updateDiary(DiaryForm Diary) {
        return diaryRepository.save(convertForm(Diary));
    }

    public void deleteDiaryById(Long id) {
        diaryRepository.deleteById(id);
    }

    private Diary convertForm(DiaryForm form){
        var dentist = dentistRepository.findById(form.getIdDentist()).orElseThrow();
        return new Diary(dentist, form.getStartTime(),form.getEndingTime());
    }

    public Diary setDentist(Long idDiary, Long idDentist) {
        var diary = diaryRepository.findById(idDiary).orElseThrow();
        var dentist = dentistRepository.findById(idDentist).orElseThrow();

        diary.setDentist(dentist);
        return diary;
    }

    public Diary setTurns(Long idDiary, List<Long> turns) {
        var diary = diaryRepository.findById(idDiary).orElseThrow();
        var turnsList = turnRepository.findAllById(turns);

        diary.setTurns(turnsList);
        return diary;
    }
}
