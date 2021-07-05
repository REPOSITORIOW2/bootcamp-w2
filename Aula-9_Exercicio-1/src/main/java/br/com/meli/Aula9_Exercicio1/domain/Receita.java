package br.com.meli.Aula9_Exercicio1.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Receita {
	@JsonProperty("name")
    private String nome;
	@JsonProperty("calories")
    private int caloriasTotais;
	@JsonProperty("ingredientes")
    List<Ingrediente> ingredientes;
    
    public Receita() {
    }

    public Receita(String nome, int caloriasTotais) {
        this.nome = nome;
        this.caloriasTotais = caloriasTotais;
    }

    public Receita(String nome, int caloriasTotais, List<Ingrediente> ingredientes) {
        this.nome = nome;
        this.caloriasTotais = caloriasTotais;
        this.ingredientes = ingredientes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCaloriasTotais() {
        return caloriasTotais;
    }

    public void setCaloriasTotais(int caloriasTotais) {
        this.caloriasTotais = caloriasTotais;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void addIngrediente(Ingrediente ingrediente){
        this.ingredientes.add(ingrediente);
        this.caloriasTotais += ingrediente.getCaloria();
    }

    public void removeIngrediente(Ingrediente ingrediente){
        this.ingredientes.remove(ingrediente);
        this.caloriasTotais -= ingrediente.getCaloria();
    }
}
