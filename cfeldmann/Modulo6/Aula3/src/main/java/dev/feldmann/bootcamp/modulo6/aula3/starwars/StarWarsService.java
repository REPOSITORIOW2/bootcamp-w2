package dev.feldmann.bootcamp.modulo6.aula3.starwars;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StarWarsService {

    @Autowired
    private ObjectMapper mapper;


    public List<StarwarsCharacter> getList() throws IOException {
        URL foods = getClass().getResource("/static/starwars.json");
        var values = mapper.readValue(foods, StarwarsCharacter[].class);
        return new ArrayList<>(Arrays.asList(values));
    }


    public List<StarwarsCharacter> searchByName(String name) throws IOException {
        String searchName = name.toLowerCase();
        return getList().stream()
                .filter(character -> character.getName().toLowerCase().contains(searchName))
                .collect(Collectors.toList());
    }

}
