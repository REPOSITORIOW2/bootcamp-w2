package br.com.meli.Aula9_Exercicio1.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.meli.Aula9_Exercicio1.business.IngredienteBusiness;
import br.com.meli.Aula9_Exercicio1.domain.Ingrediente;

@RestController
@RequestMapping("/ingrediente")
public class IngredienteController {
	
	@Autowired
	private IngredienteBusiness ingredienteBusiness;

	@ResponseStatus(value = HttpStatus.OK)
	@RequestMapping("get/{name}")
	public Ingrediente get(@PathVariable String name) {
		return ingredienteBusiness.find(name);
	}
	
	@ResponseStatus(value = HttpStatus.OK)
	@RequestMapping("getAll")
	public List<Ingrediente> getAll() {
		return ingredienteBusiness.findAll();
	}
}
