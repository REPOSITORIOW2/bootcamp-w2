package com.calculadoracalorias.demo.models;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

public class alimentoModel {
    private String name;
    private int calories;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<IngredientesModel> ingredientes;

    public List<IngredientesModel> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<IngredientesModel> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
}
