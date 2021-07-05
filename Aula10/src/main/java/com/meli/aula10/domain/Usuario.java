package com.meli.aula10.domain;

import com.meli.aula10.domain.enums.TipoUsuario;

public abstract class Usuario {
    private int id;
    private String nome;
    private TipoUsuario tipoUsuario;

    public Usuario(int id, String nome, TipoUsuario tipo) {
        this.id = id;
        this.nome = nome;
        this.tipoUsuario = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
