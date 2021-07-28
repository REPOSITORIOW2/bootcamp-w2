package br.com.meli.starwars.service;

import br.com.meli.starwars.entity.PersonagemDTO;
import br.com.meli.starwars.repository.StarWarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StarSeviceImpl implements StarService{
    @Autowired
    private StarWarsRepository repository;

    @Override
    public PersonagemDTO getPersonagemByNamePart(String name) {
        return repository.getPersonagemByNamePart(name);
    }
}
