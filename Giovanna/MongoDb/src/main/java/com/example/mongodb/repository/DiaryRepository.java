package com.example.mongodb.repository;


import com.example.mongodb.model.Diary;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiaryRepository extends MongoRepository<Diary,String> {
}
