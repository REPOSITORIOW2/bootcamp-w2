package br.com.meli.odontology.services;

import br.com.meli.odontology.entities.Diary;
import br.com.meli.odontology.forms.DiaryForm;
import br.com.meli.odontology.repositories.DentistMongoRepository;
import br.com.meli.odontology.repositories.DiaryMongoRepository;
import br.com.meli.odontology.repositories.TurnMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiaryService {
    @Autowired
    DiaryMongoRepository diaryMongoRepository;

    @Autowired
    DentistMongoRepository dentistMongoRepository;

    @Autowired
    TurnMongoRepository turnMongoRepository;

    public Diary addDiary(DiaryForm Diary) {

        return diaryMongoRepository.save(convertForm(Diary));
    }

    public List<Diary> listAllDiarys() {
        return diaryMongoRepository.findAll();
    }

    public Diary updateDiary(DiaryForm Diary) {
        return diaryMongoRepository.save(convertForm(Diary));
    }

    public void deleteDiaryById(String id) {
        diaryMongoRepository.deleteById(id);
    }

    private Diary convertForm(DiaryForm form){
        var dentist = dentistMongoRepository.findById(form.getIdDentist()).orElseThrow();
        return new Diary(dentist, form.getStartTime(),form.getEndingTime());
    }
//
//    public Diary setDentist(Long idDiary, Long idDentist) {
//        var diary = diaryRepository.findById(idDiary).orElseThrow();
//        var dentist = dentistRepository.findById(idDentist).orElseThrow();
//
//        diary.setDentist(dentist);
//        return diary;
//    }
//
//    public Diary setTurns(Long idDiary, List<Long> turns) {
//        var diary = diaryRepository.findById(idDiary).orElseThrow();
//        var turnsList = turnRepository.findAllById(turns);
//
//        diary.setTurns(turnsList);
//        return diary;
//    }
}
