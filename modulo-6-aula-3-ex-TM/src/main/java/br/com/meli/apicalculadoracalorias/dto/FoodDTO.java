package br.com.meli.apicalculadoracalorias.dto;

public class FoodDTO {
    private String name;
    private double calories;

    public FoodDTO() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }
}
