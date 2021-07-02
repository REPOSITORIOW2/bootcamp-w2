package com.meli.calculadoracalorias.service;

import com.meli.calculadoracalorias.entity.Food;
import com.meli.calculadoracalorias.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FoodService {

    @Autowired
    private FoodRepository foodRepository;

    public List<Food> getList() {
        return foodRepository.getList();
    }

    public Food getFood(String nome) {
        Optional<Food> food = foodRepository.getList().stream().filter(f -> f.getName().equals(nome)).findFirst();
        return food.orElse(null);
    }

}
