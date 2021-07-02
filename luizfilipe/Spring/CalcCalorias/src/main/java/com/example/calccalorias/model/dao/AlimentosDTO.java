package com.example.calccalorias.model.dao;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

public class AlimentosDTO {
    private String name;
    private Integer calories;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<IngredientsDTO> ingredients;

    public AlimentosDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCalories() {
        return calories;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }

    public List<IngredientsDTO> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<IngredientsDTO> ingredients) {
        this.ingredients = ingredients;
    }
}
