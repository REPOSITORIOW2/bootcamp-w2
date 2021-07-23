package com.example.mongodb.repository;


import com.example.mongodb.model.Dentist;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DentistRepository extends MongoRepository<Dentist,String> {

}
