package dev.feldmann.bootcamp.grupo.ExercicioEcommerce.repositories;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.feldmann.bootcamp.grupo.ExercicioEcommerce.models.Product;
import dev.feldmann.bootcamp.grupo.ExercicioEcommerce.utils.MapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository extends MapRepository<Product> {


}

