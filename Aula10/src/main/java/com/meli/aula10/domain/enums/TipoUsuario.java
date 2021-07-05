package com.meli.aula10.domain.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

public enum TipoUsuario {

    @JsonProperty("ADMIN")
    ADMIN("ADMIN", 1),
    @JsonProperty("CLIENTE")
    CLIENTE("CLIENTE", 2);

    private String type;
    private int idx;

    @JsonCreator
    TipoUsuario(String type, int idx) {
        this.type = type;
        this.idx = idx;
    }

    @JsonValue
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }
}
