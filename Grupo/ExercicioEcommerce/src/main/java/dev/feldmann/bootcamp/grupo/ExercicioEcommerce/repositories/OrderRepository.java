package dev.feldmann.bootcamp.grupo.ExercicioEcommerce.repositories;

import dev.feldmann.bootcamp.grupo.ExercicioEcommerce.models.Order;
import dev.feldmann.bootcamp.grupo.ExercicioEcommerce.models.Product;
import dev.feldmann.bootcamp.grupo.ExercicioEcommerce.utils.MapRepository;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import com.fasterxml.jackson.databind.ObjectMapper;

@Repository
public class OrderRepository extends MapRepository<Order> {

}
