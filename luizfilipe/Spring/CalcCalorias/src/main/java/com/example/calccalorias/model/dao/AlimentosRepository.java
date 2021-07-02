package com.example.calccalorias.model.dao;

import java.util.List;

public interface AlimentosRepository {
    public List<AlimentosDTO> getAllAlimentos();
    public AlimentosDTO getByID(Integer id);
}
