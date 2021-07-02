package br.com.meli.calorias.repository;

import br.com.meli.calorias.entity.Food;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class FoodRepository {

    private static final File FILE = new File("src/main/resources/static/food.json");
    @Autowired
    private ObjectMapper mapper;

    public List<Food> getAll(){

        List<Food> foods = new ArrayList<>();

        try {
            FileInputStream is = new FileInputStream(FILE);
            TypeReference<List<Food>> typeReference = new TypeReference<List<Food>>() {};
            foods = mapper.readValue(is, typeReference);
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return foods;

    }

    public Food find(String name){
        return getAll().stream().filter(f -> f.getName().equals(name)).findFirst().orElseThrow(RuntimeException::new);
    }

}
