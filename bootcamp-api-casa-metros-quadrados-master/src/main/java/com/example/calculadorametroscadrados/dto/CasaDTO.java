package com.example.calculadorametroscadrados.dto;

import java.util.List;

public class CasaDTO {
    private long id;
    private String nome;
    private String endereco;
    private Double metros;
    private Double totalPrice;
    private ComodoDTO maiorComodo;
    private List<ComodoDTO> comodos;

    public CasaDTO(long id, String nome, String endereco, List<ComodoDTO> comodos) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.comodos = comodos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public List<ComodoDTO> getComodos() {
        return comodos;
    }

    public void setComodos(List<ComodoDTO> comodos) {
        this.comodos = comodos;
    }

    public Double getMetros() {
        double result = 0.0;

        for (ComodoDTO comodo : this.comodos) {
            result += comodo.getMetros();
        }

        return result;
    }

    public Double getTotalPrice() {
        return this.getMetros() * 800.0;
    }

    public ComodoDTO getMaiorComodo() {
        ComodoDTO comodo = this.comodos.get(0);

        for (ComodoDTO c: this.comodos) {
            if (c.getMetros() < comodo.getMetros()) {
                comodo = c;
            }
        }

        return comodo;
    }
}
