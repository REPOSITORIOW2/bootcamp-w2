package br.com.meli.odontology.repositories;

import br.com.meli.odontology.entities.Diary;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiaryMongoRepository extends MongoRepository<Diary, String> {
}
