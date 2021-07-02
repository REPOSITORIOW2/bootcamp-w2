package com.calculadoracalorias.demo.models;

public class IngredientesModel {
    private String name;
    private int calories;

    public IngredientesModel(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    public IngredientesModel() {
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
