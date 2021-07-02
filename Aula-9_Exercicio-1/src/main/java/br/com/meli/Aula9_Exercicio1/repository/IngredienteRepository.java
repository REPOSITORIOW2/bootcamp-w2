package br.com.meli.Aula9_Exercicio1.repository;

import br.com.meli.Aula9_Exercicio1.domain.Ingrediente;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

@Repository
public class IngredienteRepository {
    private static final String FOODS_FILE = "food.json";
    private File getJson(String fileName) throws FileNotFoundException {
        File file = null;
        file = ResourceUtils.getFile("classpath:" + fileName);
        return file;
    }

    public List<Ingrediente> getFoods (){
        List<Ingrediente> ingredientes = null;
        try {
            File file = this.getJson(FOODS_FILE);
            ObjectMapper mapper = new ObjectMapper();
            TypeReference<List<Ingrediente>> typeRef = new TypeReference<>() {};
            ingredientes = mapper.readValue(file, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ingredientes;
    }
}

