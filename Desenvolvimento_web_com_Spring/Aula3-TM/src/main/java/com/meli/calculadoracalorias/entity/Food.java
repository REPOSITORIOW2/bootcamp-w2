package com.meli.calculadoracalorias.entity;

public class Food {
    private String name;
    private int calories;

    public Food(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    public Food() {
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }
}
