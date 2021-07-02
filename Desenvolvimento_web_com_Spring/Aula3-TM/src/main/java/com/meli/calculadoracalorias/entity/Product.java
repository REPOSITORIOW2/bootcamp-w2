package com.meli.calculadoracalorias.entity;

import java.util.List;

public class Product {
    private String productName;
    private int productCalories;
    private List<Food> ingredients;

    public Product(String productName, int productCalories, List<Food> ingredients) {
        this.productName = productName;
        this.productCalories = productCalories;
        this.ingredients = ingredients;
    }

    public Product() {
    }

    public String getProductName() {
        return productName;
    }

    public int getProductCalories() {
        return productCalories;
    }

    public List<Food> getIngredients() {
        return ingredients;
    }
}
