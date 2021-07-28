package br.com.meli.aula2spring.diploma.repositories;

import br.com.meli.aula2spring.diploma.entities.Aluno;
import br.com.meli.aula2spring.diploma.interfaces.Idable;
import org.springframework.stereotype.Repository;

import java.util.*;

public class MapRepository<T extends Idable> {
    private final Map<Integer, T> repositorio = new HashMap<>();
    private Integer id = 0;

    public void save(T item){
        if(item.getId() == null){
            item.setId(this.id);
            this.id++;
        }
        repositorio.put(item.getId(),item);
    }

    public void delete(Integer id){
        repositorio.remove(id);
    }

    public List<T> listAll(){
        return new ArrayList<T>(repositorio.values());
    }

    public T findById(Integer id){
        return repositorio.get(id);
    }
}
