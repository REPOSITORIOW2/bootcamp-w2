package br.com.meli.alimentos.repository;

import java.util.List;

public interface AlimentoRepository {
    AlimentoDTO findAlimentoByName(String name);
    List<AlimentoDTO> listaAlimentos();
}
