package com.meli.calories.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import com.meli.calories.services.FoodService;
import com.meli.calories.entities.Food;
import java.util.List;

@RestController
@RequestMapping("foods")
public class FoodController {

    private final FoodService foodService;


    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping
    public List<Food> getAllFoodItems() {
        return this.foodService.getAllFoodItems();
    }

    @GetMapping("{name}")
    public Food getFood(@PathVariable String name) {
        return this.foodService.getFood(name);
    }
}