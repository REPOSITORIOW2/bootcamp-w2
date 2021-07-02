package com.meli.calories.repositories;

import com.meli.calories.entities.Food;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.File;
import java.nio.file.Paths;

@Repository
public class FoodRepository {
    
    private List<Food> allFoods = new ArrayList<>();


    public FoodRepository() {
        ObjectMapper mapper = new ObjectMapper();
        try {  
            File file = ResourceUtils.getFile("classpath:static/food.json");
        
            this.allFoods = Arrays.asList(mapper.readValue(file, Food[].class));
        } catch (Exception e) {
            System.err.println("Could not open the file.");
        }
    }
    
    public List<Food> getFoods() {
        return this.allFoods;
    }

    public Food getFood(String name) {
        return this.allFoods.stream().filter(food -> food.getName().equalsIgnoreCase(name)).findFirst().get();
    }
}