package br.com.exercicio1.calculadoracalorias.Services;

import br.com.exercicio1.calculadoracalorias.Entities.Ingrediente;
import br.com.exercicio1.calculadoracalorias.Respositories.IngredienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredienteService {
    private IngredienteRepository ingredienteRepository;

    @Autowired
    public IngredienteService(IngredienteRepository repository) {
        this.ingredienteRepository = repository;
    }

    public List<Ingrediente> obterLista() {
        return this.ingredienteRepository.obterListaIngrediente();
    }

    public Ingrediente obterIngrediente(String nome) {
        return this.ingredienteRepository.obterIngrediente(nome);
    }
}
