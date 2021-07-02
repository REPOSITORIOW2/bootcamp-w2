package br.com.meli.bootcamp.simplecrud.services;

import br.com.meli.bootcamp.simplecrud.controllers.Pessoa;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class User {

    private Map<Integer, Pessoa> listaPessoas;
    private Integer initkey;

    public User() {
        initkey = 0;
        listaPessoas = new HashMap<>();
    }

    public Pessoa create(Pessoa p) {
        this.initkey += 1;
        return listaPessoas.put(initkey, p);
    }

    public Pessoa delete(Integer id) {
        return listaPessoas.remove(id);
    }

    public Pessoa update(Integer id, Pessoa p) {
        listaPessoas.put(id, p);
        return p;
    }

    public Pessoa read(Integer id) {
        return listaPessoas.get(id);
    }

}
