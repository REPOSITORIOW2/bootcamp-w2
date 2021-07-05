package com.meli.aula10.domain;

import com.meli.aula10.domain.enums.TipoUsuario;

public class Admin extends Usuario{

    public Admin(int id, String nome) {
        super(id, nome, TipoUsuario.ADMIN);
    }
}
