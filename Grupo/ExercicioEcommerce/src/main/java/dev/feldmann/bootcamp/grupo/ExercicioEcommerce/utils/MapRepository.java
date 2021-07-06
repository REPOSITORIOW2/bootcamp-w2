package dev.feldmann.bootcamp.grupo.ExercicioEcommerce.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class MapRepository<T extends Ideable> {

    private HashMap<Long, T> bd = new HashMap<>();
    private Long id = 0L;


    public void save(T item) {
        if (item.getID() == null) {
            item.setID(id);
            id++;
        }
        bd.put(item.getID(), item);
    }

    public Optional<T> getByID(Long id){
        if(bd.containsKey(id)){
           return Optional.of(bd.get(id));
        }
        return Optional.empty();
    }

    public T remove(T item){
        return bd.remove(item.getID());
    }

    public List<T> getItems(){
        List<T> lista = new ArrayList<>(bd.values());
        return lista;
    }
}
