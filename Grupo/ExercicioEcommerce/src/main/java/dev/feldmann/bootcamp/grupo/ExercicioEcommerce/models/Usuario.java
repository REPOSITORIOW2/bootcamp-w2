package dev.feldmann.bootcamp.grupo.ExercicioEcommerce.models;

import dev.feldmann.bootcamp.common.jsonRepository.Identifiable;

public class Usuario implements Identifiable {
    private String nome;
    private long numCadastro;
    private long id;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }
}
