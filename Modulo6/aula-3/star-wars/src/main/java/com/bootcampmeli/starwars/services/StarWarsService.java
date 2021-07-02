package com.bootcampmeli.starwars.services;

import java.util.List;

import com.bootcampmeli.starwars.entities.StarWarsCharacter;
import com.bootcampmeli.starwars.repositories.StarWarsRepository;
import org.springframework.stereotype.Service;
import java.util.stream.Collectors;


@Service
public class StarWarsService {

    private final StarWarsRepository starWarsRepository;


    public StarWarsService(StarWarsRepository starWarsRepository) {
        this.starWarsRepository = starWarsRepository;
    }

    public String getMatchingCharacters(String key) {
        List<StarWarsCharacter> characters = this.starWarsRepository.getMatchingCharacters(key);

        List<String> characterNames = characters.stream().map(StarWarsCharacter::getName).collect(Collectors.toList());

        return String.join(", ", characterNames);
    }
}