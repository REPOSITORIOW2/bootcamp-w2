package br.com.meli.Aula9_Exercicio1.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import br.com.meli.Aula9_Exercicio1.domain.Ingrediente;
import br.com.meli.Aula9_Exercicio1.repository.IngredienteRepository;

@Service
public class IngredienteBusiness {

	@Autowired
	private IngredienteRepository ingredienteRepository;
	
	public Ingrediente find(String name) {
		Ingrediente ingrediente = ingredienteRepository.finByName(name);
		if(ingrediente == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Ingrediente "+name+" não existe");
		return ingrediente;
	}
	
	public List<Ingrediente> findAll() {
		return ingredienteRepository.findAll();
	}
	
}
