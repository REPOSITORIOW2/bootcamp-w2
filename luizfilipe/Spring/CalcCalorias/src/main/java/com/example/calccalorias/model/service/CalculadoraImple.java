package com.example.calccalorias.model.service;

import com.example.calccalorias.model.dao.AlimentosDTO;
import com.example.calccalorias.model.dao.AlimentosRepository;
import com.example.calccalorias.model.dao.AlimentosRepositoryImple;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Getter
@Setter
public class CalculadoraImple {

    @Autowired
    private AlimentosRepositoryImple repoAlimentos;

    public List<AlimentosDTO> getAllFoods() {
        return repoAlimentos.getAllAlimentos();
    }

    public AlimentosDTO getFoodsByID(Integer id) {
        return repoAlimentos.getByID(id);
    }


}
