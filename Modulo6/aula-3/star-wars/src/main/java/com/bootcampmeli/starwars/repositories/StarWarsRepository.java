package com.bootcampmeli.starwars.repositories;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import com.bootcampmeli.starwars.entities.StarWarsCharacter;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;
import java.util.stream.Collectors;

@Repository
public class StarWarsRepository {
    
    private List<StarWarsCharacter> allCharacters = new ArrayList<>();

    public StarWarsRepository() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        try {  
            File file = ResourceUtils.getFile("classpath:static/starwars.json");
        
            this.allCharacters = Arrays.asList(mapper.readValue(file, StarWarsCharacter[].class));
        } catch (Exception ex) {
            throw ex;
        }
    }

    public List<StarWarsCharacter> getMatchingCharacters(String key) {
        return allCharacters
            .stream()
            .filter(character -> character.getName().toLowerCase().contains(key.toLowerCase()))
            .collect(Collectors.toList());
    }
}
