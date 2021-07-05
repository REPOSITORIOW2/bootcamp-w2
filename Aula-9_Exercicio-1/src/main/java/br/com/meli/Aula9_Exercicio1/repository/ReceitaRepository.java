package br.com.meli.Aula9_Exercicio1.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.meli.Aula9_Exercicio1.domain.Receita;

@Repository
public class ReceitaRepository extends GenericRepository<Receita>{

	private static final String RECEITAS_FILE = "receitas.json";
	
	public ReceitaRepository() {
		super(RECEITAS_FILE);
	}
	
	@Override
	public Receita finByName(String name) {
		ObjectMapper mapper = new ObjectMapper();
        List<Receita> receitas = mapper.convertValue(findAll(), new TypeReference<List<Receita>>() { });

        return receitas.stream().filter(i -> i.getNome().equalsIgnoreCase(name)).findFirst().orElse(null);

	}

	
}
