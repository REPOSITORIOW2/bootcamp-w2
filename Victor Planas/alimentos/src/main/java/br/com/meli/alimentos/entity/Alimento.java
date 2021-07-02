package br.com.meli.alimentos.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

public class Alimento {
    private String name;
    private int calories;
    private List<Ingrediente> listaDeIngredientes;

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

    public List<Ingrediente> getListaDeIngredientes() {
        return listaDeIngredientes;
    }

    public void setListaDeIngredientes(List<Ingrediente> listaDeIngredientes) {
        this.listaDeIngredientes = listaDeIngredientes;
    }
}
