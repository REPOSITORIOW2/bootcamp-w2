package com.calculadoracalorias.demo.services;

import com.calculadoracalorias.demo.models.alimentoModel;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class alimentoService {

    public alimentoModel findAlimentoByName(String name) {
        List<alimentoModel> alimentos = carregaJson();
        alimentoModel result = null;
        if (alimentos != null) {
            Optional<alimentoModel> item = alimentos.stream().filter(a -> a.getName().equals(name)).findFirst();
            if(item.isPresent()) result = item.get();
        }
        return result;
    }

    public List<alimentoModel> lista() {
        List<alimentoModel> alimentoDTOS = carregaJson();
        return alimentoDTOS;
    }

    private List<alimentoModel> carregaJson() {
        File file = null;
        try {
            file = ResourceUtils.getFile("src/main/resources/static/food.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<alimentoModel>> ref = new TypeReference<>() {
        };
        List<alimentoModel> alimentoList = null;
        try {
            alimentoList = objectMapper.readValue(file, ref);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return alimentoList;
    }
}
