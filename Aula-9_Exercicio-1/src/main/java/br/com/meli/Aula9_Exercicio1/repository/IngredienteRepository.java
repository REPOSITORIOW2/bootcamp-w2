package br.com.meli.Aula9_Exercicio1.repository;

import br.com.meli.Aula9_Exercicio1.domain.Ingrediente;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class IngredienteRepository extends GenericRepository<Ingrediente> {
	
	private static final String FOODS_FILE = "food.json";
	
    public IngredienteRepository() {
		super(FOODS_FILE);
	}
    
    @Override
    public Ingrediente finByName(String name) {
    	ObjectMapper mapper = new ObjectMapper();
        List<Ingrediente> ingredientes = mapper.convertValue(findAll(), new TypeReference<List<Ingrediente>>() { });
    	return ingredientes.stream().filter(i -> i.getNome().equalsIgnoreCase(name)).findFirst().orElse(null);
    }

}

