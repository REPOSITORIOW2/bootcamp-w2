package com.meli.calories.services;

import org.springframework.stereotype.Service;
import com.meli.calories.repositories.FoodRepository;
import com.meli.calories.entities.Food;
import java.util.List;

@Service
public class FoodService {
    
    private final FoodRepository foodRepository;


    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }
    
    public List<Food> getAllFoodItems() {
        return this.foodRepository.getFoods();
    }

    public Food getFood(String name) {
        return this.foodRepository.getFood(name);
    }
}