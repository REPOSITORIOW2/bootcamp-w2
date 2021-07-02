package com.example.diploma.service;

public class ResultadoAluno {
    String nome;
    Double media;
    String mensagem;

    public ResultadoAluno(String nome, Double media) {
        this.nome = nome;
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
