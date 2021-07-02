package br.com.meli.apicalculadoracalorias.repositories;

import br.com.meli.apicalculadoracalorias.dto.FoodDTO;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

@Repository
public class FoodRepository {
    public List<FoodDTO> findAll() {
        return loadFile();
    }

    public FoodDTO findByName(String name) {
        List<FoodDTO> foodList = loadFile();

        for(FoodDTO food : foodList) {
            if(food.getName().equalsIgnoreCase(name)) {
                return food;
            }
        }

        return null;
    }

    private List<FoodDTO> loadFile() {
        File file = null;

        try {
            file = ResourceUtils.getFile("src/main/java/br/com/meli/apicalculadoracalorias/food.json");
        } catch (FileNotFoundException e) {
            System.err.println(e);
        }

        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<FoodDTO>> typeRef = new TypeReference<>() {};

        List<FoodDTO> foodDTOS = null;

        try {
            foodDTOS = objectMapper.readValue(file, typeRef);
        } catch (IOException e) {
            System.err.println(e);
        }
        
        return foodDTOS;
    }
}
