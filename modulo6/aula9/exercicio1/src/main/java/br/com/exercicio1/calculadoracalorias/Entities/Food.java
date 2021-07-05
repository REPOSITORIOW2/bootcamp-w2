package br.com.exercicio1.calculadoracalorias.Entities;

import java.util.ArrayList;
import java.util.List;

public class Food {
    private String nome;
    private List<Ingrediente> listaIngredientes = new ArrayList<>();

    public Food(String nome, List<Ingrediente> listaIngredientes) {
        this.nome = nome;
        this.listaIngredientes = listaIngredientes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Ingrediente> getListaIngredientes() {
        return listaIngredientes;
    }

    public void setListaIngredientes(List<Ingrediente> listaIngredientes) {
        this.listaIngredientes = listaIngredientes;
    }

    public Double getCaloriasTotais() {
        return this.listaIngredientes.stream().mapToDouble(i->i.getCalories()).sum();
    }
}
