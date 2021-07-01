package com.module6.class8.api.areacalculator.entity;

import java.util.ArrayList;
import java.util.List;

public class Casa {
    private long id;
    private String nome;
    private String endereco;
    private List<Comodo> comodos = new ArrayList<>();

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Comodo> getComodos() {
        return comodos;
    }

    public double getTotalMetrosQuadrados() {
        double metrosQuadrados = this.getComodos()
                .stream()
                .map(Comodo::getArea)
                .reduce(0.0, Double::sum);

        return metrosQuadrados;
    }

    public Casa(long id, String nome, String endereco) {
        super();
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
    }

    public Casa(long id, String nome, String endereco, List<Comodo> comodos) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.comodos = comodos;
    }
}
