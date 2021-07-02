package br.com.meli.Aula9_Exercicio1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.meli.Aula9_Exercicio1.business.ReceitaBusiness;
import br.com.meli.Aula9_Exercicio1.domain.Receita;

@RestController
@RequestMapping("/receita")
public class ReceitaController {

	@Autowired
	private ReceitaBusiness receitaBusiness;

	@ResponseStatus(value = HttpStatus.OK)
	@RequestMapping("get/{name}")
	public Receita get (@PathVariable String name) {
		return receitaBusiness.find(name);
	}
	
	@ResponseStatus(value = HttpStatus.OK)
	@RequestMapping("getAll")
	public List<Receita> getAll() {
		return receitaBusiness.findAll();
	}
}
