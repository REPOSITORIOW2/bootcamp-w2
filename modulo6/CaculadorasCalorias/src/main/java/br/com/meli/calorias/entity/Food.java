package br.com.meli.calorias.entity;

import java.util.List;

public class Food {

    private String name;
    private int calories;
    private List<Ingredient> ingredients;

    public Food(String name, int calories, List<Ingredient> ingri) {
        this.name = name;
        this.calories = calories;
        this.ingredients = ingri;
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

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

}
