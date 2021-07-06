package dev.feldmann.bootcamp.grupo.ExercicioEcommerce.repositories;

import dev.feldmann.bootcamp.grupo.ExercicioEcommerce.models.Usuario;
import com.fasterxml.jackson.databind.ObjectMapper;
import dev.feldmann.bootcamp.common.jsonRepository.JsonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository extends JsonRepository<Usuario> {
    @Autowired
    public UserRepository(ObjectMapper mapper) {
        super(mapper, "storage/users.json");
    }
}
