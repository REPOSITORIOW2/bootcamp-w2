package br.com.mercadolivre.food.Produto;

import java.util.List;

public class Produto {

    private String nome;
    private double calorias;
    private List<Ingrediente> ingredientes;

    public Produto(String nome, double calorias, List<Ingrediente> ingredientes) {
        this.nome = nome;
        this.calorias = calorias;
        this.ingredientes = ingredientes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }
}
