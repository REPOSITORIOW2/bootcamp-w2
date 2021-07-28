package br.com.meli.alimentos.service;

import br.com.meli.alimentos.repository.AlimentoDTO;

import java.util.List;

public interface AlimentoService {

    public List<AlimentoDTO> getListaAlimentosDTO();
    public AlimentoDTO getAlimentoByName(String name);
}
