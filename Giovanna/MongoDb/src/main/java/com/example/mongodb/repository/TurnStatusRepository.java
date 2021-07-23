package com.example.mongodb.repository;



import com.example.mongodb.model.TurnStatus;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TurnStatusRepository extends MongoRepository<TurnStatus,String> {
}
