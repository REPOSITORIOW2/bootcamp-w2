package com.bootcamp.demo.service;

import com.bootcamp.demo.model.Diary;
import com.bootcamp.demo.repository.DiaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiaryService {
    @Autowired
    DiaryRepository diaryRepository;

    public Diary addDiary(Diary Diary) {
        return diaryRepository.save(Diary);
    }

    public List<Diary> listAllDiarys() {
        return diaryRepository.findAll();
    }

    public Diary updateDiary(Diary Diary) {
        return diaryRepository.save(Diary);
    }

    public void deleteDiaryById(Long id) {
        diaryRepository.deleteById(id);
    }
}