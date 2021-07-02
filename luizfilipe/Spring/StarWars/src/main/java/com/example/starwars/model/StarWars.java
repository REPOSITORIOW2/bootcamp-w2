package com.example.starwars.model;

public interface StarWars {
    public List<PersoDTO>getAll();
    public List<PersonDTO> getByName(String name);
}
