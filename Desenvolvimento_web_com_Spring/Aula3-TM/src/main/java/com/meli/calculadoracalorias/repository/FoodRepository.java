package com.meli.calculadoracalorias.repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.meli.calculadoracalorias.entity.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class FoodRepository {
    private static final File FILE = new File("food.json");

    @Autowired
    private ObjectMapper mapper;

    public List<Food> getList(){
        List<Food> foods = new ArrayList<>();
        Map<String, List<Food>> map = new HashMap<>();
        try {
            FileInputStream is = new FileInputStream(FILE);
            TypeReference<Map<String, List<Food>>> typeReference = new TypeReference<Map<String, List<Food>>>() {};
            map = mapper.readValue(is, typeReference);
            foods = map.get("foods");
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return foods;
    }
}
