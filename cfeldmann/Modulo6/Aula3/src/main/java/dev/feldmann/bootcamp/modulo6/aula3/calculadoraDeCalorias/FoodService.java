package dev.feldmann.bootcamp.modulo6.aula3.calculadoraDeCalorias;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class FoodService {

    @Autowired
    private ObjectMapper mapper;


    public List<Food> getList() throws IOException {
        URL foods = getClass().getResource("/static/foods.json");
        var values = mapper.readValue(foods, Food[].class);
        return new ArrayList<>(Arrays.asList(values));

    }

}
