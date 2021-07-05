package br.com.meli.Aula9_Exercicio1.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import br.com.meli.Aula9_Exercicio1.domain.Receita;
import br.com.meli.Aula9_Exercicio1.repository.ReceitaRepository;

@Service
public class ReceitaBusiness {


	@Autowired
	private ReceitaRepository receitaRepository;
	
	public Receita find(String name) {
		Receita receita = receitaRepository.finByName(name);
		if(receita == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Ingrediente "+name+" não existe");
		return receita;
	}
	
	public List<Receita> findAll() {
		return receitaRepository.findAll();
	}
	
}
