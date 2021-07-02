package com.bootcamp.starwars.service;

import com.bootcamp.starwars.models.Personagem;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

@Service
public class StarwarsService {
    public List<String> getByAlias(String alias){
        List<Personagem> personagemList = carregaJson();
        List<String> result = new ArrayList(){};
        if (personagemList != null) {
            List<Personagem> item = personagemList.stream().filter(a -> a.getName().toLowerCase().contains(alias.toLowerCase())).collect(toList());
            item.forEach(c -> result.add(c.getName()));
        }
        return result;
    }

    private List<Personagem> carregaJson() {
        File file = null;
        try {
            file = ResourceUtils.getFile("src/main/resources/static/starwars.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<Personagem>> ref = new TypeReference<>() {
        };
        List<Personagem> personagemList = null;
        try {
            personagemList = objectMapper.readValue(file, ref);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return personagemList;
    }
}
