package br.com.exercicio1.calculadoracalorias.Respositories;

import br.com.exercicio1.calculadoracalorias.Entities.Food;
import br.com.exercicio1.calculadoracalorias.Entities.Ingrediente;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class IngredienteRepository {
    private static final File FILE = new File("src/main/java/br/com/exercicio1/calculadoracalorias/bd/food.json");

    @Autowired
    private ObjectMapper mapper;

    public List<Ingrediente> obterListaIngrediente() {
        List<Ingrediente> listaIngredientes = new ArrayList<>();
        try {
            FileInputStream is = new FileInputStream(FILE);
            TypeReference<List<Ingrediente>> typeReference = new TypeReference<List<Ingrediente>>() {};
            listaIngredientes = mapper.readValue(is, typeReference);
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return listaIngredientes;
    }

    public Ingrediente obterIngrediente(String nome) {
        List<Ingrediente> listaIngredientes = new ArrayList<>();
        listaIngredientes = obterListaIngrediente();
        return listaIngredientes.stream().filter(i -> i.getName().equals(nome)).findFirst().orElse(null);
    }
}
