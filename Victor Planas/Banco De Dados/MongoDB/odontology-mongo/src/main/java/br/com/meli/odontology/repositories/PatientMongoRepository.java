package br.com.meli.odontology.repositories;

import br.com.meli.odontology.entities.Patient;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientMongoRepository extends MongoRepository<Patient, String> {



}
