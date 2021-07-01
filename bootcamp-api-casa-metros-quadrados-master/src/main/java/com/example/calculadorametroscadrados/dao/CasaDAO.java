package com.example.calculadorametroscadrados.dao;

import com.example.calculadorametroscadrados.dto.CasaDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CasaDAO {
    private static final Map<Long, CasaDTO> db = new HashMap<>();
    private static Long id = 1L;

    public static List<CasaDTO> findAll() {
        List<CasaDTO> res = new ArrayList<>();

        for(Map.Entry<Long, CasaDTO> casa : db.entrySet()) {
            res.add(casa.getValue());
        }

        return  res;
    }

    public static CasaDTO findById(Long id) {
        if (db.containsKey(id)) {
            return db.get(id);
        }

        return null;
    }

    public static CasaDTO add(CasaDTO casa) {
        casa.setId(id);
        db.put(id, casa);
        id++;

        return db.get(id);
    }

    public static CasaDTO update(Long id, CasaDTO casa) {
        if (db.containsKey(id)) {
            casa.setId(id);
            db.put(id, casa);
        }

        return null;
    }

    public static CasaDTO delete(Long id) {
        if (db.containsKey(id)){
            return db.remove(id);
        }

        return null;
    }
}
