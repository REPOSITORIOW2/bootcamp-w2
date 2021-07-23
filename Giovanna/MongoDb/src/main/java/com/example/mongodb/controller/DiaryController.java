package com.example.mongodb.controller;


import com.example.mongodb.model.Diary;
import com.example.mongodb.service.DiaryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/diary")
@RequiredArgsConstructor
public class DiaryController {
    private final
    DiaryService diaryService;

    @PostMapping("/add")
    public Diary addDiary(@RequestBody Diary Diary){
        return diaryService.addDiary(Diary);
    }

    @GetMapping("/list")
    public List<Diary> getDiaryList(){
        return diaryService.listAllDiarys();
    }

    @PutMapping("/update")
    public Diary updateDiary(@RequestBody Diary Diary){
        return diaryService.updateDiary(Diary);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteDiaryById(@RequestParam String id){
        diaryService.deleteDiaryById(id);
    }
}