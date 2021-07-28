package com.example.mongodb.repository;


import com.example.mongodb.model.Turn;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurnRepository extends MongoRepository<Turn,String> {
}
