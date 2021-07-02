package com.example.calccalorias.model.dao;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

@Component
public class AlimentosRepositoryImple implements AlimentosRepository{

    private List<AlimentosDTO> loadDatabase() {
        File file = null;

        try {
            file = ResourceUtils.getFile("classpath:static/food.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<AlimentosDTO>> typeRef = new TypeReference<>() {};
        List<AlimentosDTO> alimentosDTOS = null;

        try {
            alimentosDTOS = objectMapper.readValue(file, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return alimentosDTOS;
    }

    @Override
    public List<AlimentosDTO> getAllAlimentos() {
        return loadDatabase();
    }

    @Override
    public AlimentosDTO getByID(Integer id) {
        List<AlimentosDTO> fullList = loadDatabase();

        AlimentosDTO result = fullList.get(id);

        return result;
    }
}
