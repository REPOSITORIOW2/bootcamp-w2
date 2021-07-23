package com.bootcampmeli.consultoriomongo.repositories;

import java.util.List;

import com.bootcampmeli.consultoriomongo.entities.Turn;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurnRepository extends MongoRepository<Turn, Long> {

    List<Turn> findByDentistLastName(String lastName);
    List<Turn> findByStatus(String status);
}