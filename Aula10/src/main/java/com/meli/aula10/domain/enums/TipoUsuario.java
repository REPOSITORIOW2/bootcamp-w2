package com.meli.aula10.domain.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum TipoUsuario {

    @JsonProperty("ADMIN")
    ADMIN,
    @JsonProperty("CLIENTE")
    CLIENTE
}
