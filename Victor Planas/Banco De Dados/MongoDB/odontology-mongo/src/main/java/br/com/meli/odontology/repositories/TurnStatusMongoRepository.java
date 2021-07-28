package br.com.meli.odontology.repositories;


import br.com.meli.odontology.entities.TurnStatus;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurnStatusMongoRepository extends MongoRepository<TurnStatus, String> {


}
