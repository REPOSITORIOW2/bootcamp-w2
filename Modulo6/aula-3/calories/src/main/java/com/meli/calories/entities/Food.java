package com.meli.calories.entities;

import java.util.ArrayList;
import java.util.List;

public class Food {

    private String name;
    private List<Food> ingredients = new ArrayList<>();
    private Integer calories;
    
    public Food(){}

    public Food(String name, List<Food> ingredients, Integer calories) {
        this.name = name;
        this.ingredients = ingredients;
        this.calories = calories;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Food> getIngredients() {
        return this.ingredients;
    }

    public void setIngredients(List<Food> ingredients) {
        this.ingredients = ingredients;
    }

    public Integer getCalories() {
        return this.calories;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }

    
}