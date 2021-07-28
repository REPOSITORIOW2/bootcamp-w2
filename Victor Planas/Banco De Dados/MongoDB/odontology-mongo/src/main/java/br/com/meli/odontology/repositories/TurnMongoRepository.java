package br.com.meli.odontology.repositories;

import br.com.meli.odontology.entities.Turn;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurnMongoRepository extends MongoRepository<Turn, String> {


}
