package br.com.meli.starwars.repository;

import br.com.meli.starwars.entity.PersonagemDTO;

public interface StarWarsRepository {

    public PersonagemDTO getPersonagemByNamePart(String name);
}
