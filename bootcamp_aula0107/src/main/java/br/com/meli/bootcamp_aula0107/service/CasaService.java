package br.com.meli.bootcamp_aula0107.service;

import br.com.meli.bootcamp_aula0107.model.Casa;
import br.com.meli.bootcamp_aula0107.model.dto.CasaDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CasaService {

    private static final List<Casa> casas = new ArrayList<>();

    public CasaDTO cadastraCasa(Casa casa) {
        casas.add(casa);
        return casa.converteParaDTO();
    }

}
