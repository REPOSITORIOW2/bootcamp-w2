package br.com.meli.odontology.odontology.controllers;

import br.com.meli.odontology.odontology.entities.Diary;
import br.com.meli.odontology.odontology.forms.DiaryForm;
import br.com.meli.odontology.odontology.services.DiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/diary")
public class DiaryController {
    @Autowired
    DiaryService diaryService;

    @PostMapping("/add")
    public Diary addDiary(@RequestBody DiaryForm Diary){
        return diaryService.addDiary(Diary);
    }

    @GetMapping("/list")
    public List<Diary> getDiaryList(){
        return diaryService.listAllDiarys();
    }

    @PutMapping("/update")
    public Diary updateDiary(@RequestBody DiaryForm Diary){
        return diaryService.updateDiary(Diary);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteDiaryById(@PathVariable Long id){
        diaryService.deleteDiaryById(id);
    }

    @PostMapping("/setDentist/{idDiary}/{idDentist}")
    public Diary setDentist(@PathVariable Long idDiary, @PathVariable Long idDentist){
        return diaryService.setDentist(idDiary, idDentist);
    }

    @PostMapping("setTurns/{idDiary}")
    public Diary setTurns(@PathVariable Long idDiary, @RequestBody List<Long> turns){
        return diaryService.setTurns(idDiary, turns);
    }
}
