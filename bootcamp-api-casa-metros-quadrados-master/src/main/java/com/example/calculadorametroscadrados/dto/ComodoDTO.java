package com.example.calculadorametroscadrados.dto;

public class ComodoDTO {
    private long id;
    private String nome;
    private Double largura;
    private Double comprimento;
    private Double metros;

    public ComodoDTO(long id, String nome, Double largura, Double comprimento) {
        this.id = id;
        this.nome = nome;
        this.largura = largura;
        this.comprimento = comprimento;
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

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getComprimento() {
        return comprimento;
    }

    public void setComprimento(Double comprimento) {
        this.comprimento = comprimento;
    }

    public Double getMetros() {
        return largura * comprimento;
    }
}
