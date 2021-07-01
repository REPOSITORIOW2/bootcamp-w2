package com.module6.class8.api.areacalculator.dao;

import com.module6.class8.api.areacalculator.entity.Casa;

import java.util.ArrayList;
import java.util.List;

public class CasaDAO {
    private static List<Casa> casas = new ArrayList<>();

    public List<Casa> getList() {
        return casas;
    }

    public void add(Casa casa) {
        casas.add(casa);
    }

    public Casa get(long id) {
        return casas.stream().filter(c -> c.getId() == id).findFirst().orElse(null);
    }
}
