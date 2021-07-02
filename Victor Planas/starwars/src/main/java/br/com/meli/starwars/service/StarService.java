package br.com.meli.starwars.service;

import br.com.meli.starwars.entity.PersonagemDTO;

public interface StarService {

    public PersonagemDTO getPersonagemByNamePart(String name);
}
