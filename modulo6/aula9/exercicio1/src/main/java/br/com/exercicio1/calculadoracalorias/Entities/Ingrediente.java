package br.com.exercicio1.calculadoracalorias.Entities;

public class Ingrediente {
    private String name;
    private Double calories;

    public Ingrediente(String name, Double calories) {
        this.name = name;
        this.calories = calories;
    }

    public Ingrediente() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCalories() {
        return calories;
    }

    public void setCalories(Double calories) {
        this.calories = calories;
    }
}
