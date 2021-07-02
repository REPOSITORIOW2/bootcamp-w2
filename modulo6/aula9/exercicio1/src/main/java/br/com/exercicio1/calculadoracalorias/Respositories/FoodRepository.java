package br.com.exercicio1.calculadoracalorias.Respositories;

import br.com.exercicio1.calculadoracalorias.Entities.Food;
import br.com.exercicio1.calculadoracalorias.Entities.Ingrediente;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.*;
import java.util.List;

@Repository
public class FoodRepository {
    private static final File FILE = new File("src/main/java/br/com/exercicio1/calculadoracalorias/bd/food.json");
    @Autowired
    private ObjectMapper mapper;

    public void adicionar(Food food) {
        try {
            PrintWriter out = new PrintWriter(new FileWriter(FILE, true));
            String json = mapper.writeValueAsString(food);
            out.append(json);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
