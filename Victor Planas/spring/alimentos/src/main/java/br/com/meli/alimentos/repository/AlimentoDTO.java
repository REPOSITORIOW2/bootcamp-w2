package br.com.meli.alimentos.repository;

import br.com.meli.alimentos.entity.Ingrediente;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

public class AlimentoDTO {
    private String name;
    private int calories;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Ingrediente> listaDeIngrediente;

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

    public List<Ingrediente> getListaDeIngrediente() {
        return listaDeIngrediente;
    }

    public void setListaDeIngrediente(List<Ingrediente> listaDeIngrediente) {
        this.listaDeIngrediente = listaDeIngrediente;
    }
}
