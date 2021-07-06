package dev.feldmann.bootcamp.grupo.ExercicioEcommerce.services;

import dev.feldmann.bootcamp.grupo.ExercicioEcommerce.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private OrderRepository service;

}
