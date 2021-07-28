package com.example.mongodb.service;


import com.example.mongodb.model.Diary;
import com.example.mongodb.repository.DiaryRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class DiaryService {
    private final DiaryRepository diaryRepository;

    public Diary addDiary(Diary Diary) {
        return diaryRepository.insert(Diary);
    }

    public List<Diary> listAllDiarys() {
        return diaryRepository.findAll();
    }

    public Diary updateDiary(Diary Diary) {
        return diaryRepository.insert(Diary);
    }

    public void deleteDiaryById(String id) {
        diaryRepository.deleteById(id);
    }
}