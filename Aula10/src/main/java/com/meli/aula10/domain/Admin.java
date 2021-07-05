package com.meli.aula10.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.meli.aula10.domain.enums.TipoUsuario;

@JsonTypeName("Admin")
public class Admin extends Usuario{
    @JsonProperty("tipoUsuario")
    private final String tipoUsuario = "Admin";


    public Admin() {
    }

    public Admin(int id, String nome) {
        super(id, nome);
    }
}
