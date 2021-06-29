package dev.feldmann.bootcamp.aula4.savetheropa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRoupa {

    private Integer currentId = 2555;

    HashMap<Integer, List<Vestuario>> storage = new HashMap<>();


    public Integer guardaVestuarios(List<Vestuario> vestuarioList) {
        int id = currentId;
        this.storage.put(id, vestuarioList);
        currentId++;
        return id;
    }

    public void mostrarVestuarios() {
        this.storage
                .entrySet()
                .stream()
                .flatMap(
                        e -> e.getValue().stream().map(vestuario -> Map.entry(e.getKey(), vestuario))
                ).forEach(entry -> System.out.printf("{Chave: %d, %s}%n", entry.getKey(), entry.getValue()));
    }

    public List<Vestuario> devolverVestuarios(Integer id) {
        return this.storage.remove(id);
    }




}
