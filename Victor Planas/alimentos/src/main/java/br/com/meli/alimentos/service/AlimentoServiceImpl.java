package br.com.meli.alimentos.service;

import br.com.meli.alimentos.repository.AlimentoDTO;
import br.com.meli.alimentos.repository.AlimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlimentoServiceImpl implements AlimentoService{

    @Autowired
    private AlimentoRepository repositorioAlimentos;



    public List<AlimentoDTO> getListaAlimentosDTO(){
        return repositorioAlimentos.listaAlimentos();
    }

    public AlimentoDTO getAlimentoByName(String name){
        return repositorioAlimentos.findAlimentoByName(name);
    }


}
