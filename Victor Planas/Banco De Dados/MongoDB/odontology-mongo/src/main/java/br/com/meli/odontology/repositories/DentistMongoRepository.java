package br.com.meli.odontology.repositories;

import br.com.meli.odontology.entities.Dentist;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DentistMongoRepository extends MongoRepository<Dentist, String> {

}
