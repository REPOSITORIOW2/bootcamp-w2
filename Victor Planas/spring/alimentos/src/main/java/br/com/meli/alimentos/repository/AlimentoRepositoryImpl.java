package br.com.meli.alimentos.repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Repository
public class AlimentoRepositoryImpl implements AlimentoRepository {


    @Override
    public AlimentoDTO findAlimentoByName(String name) {
        List<AlimentoDTO> alimentoDTOS = null;
        alimentoDTOS = carregaJson();
        AlimentoDTO result = null;
        if (alimentoDTOS != null) {
            Optional<AlimentoDTO> item = alimentoDTOS.stream().filter(alimentoDTO -> alimentoDTO.getName().equals(name)).findFirst();
            if(item.isPresent()) result = item.get();
        }
        return result;
    }

    @Override
    public List<AlimentoDTO> listaAlimentos() {
        List<AlimentoDTO> alimentoDTOS = null;
        alimentoDTOS = carregaJson();
        return alimentoDTOS;
    }

    private List<AlimentoDTO> carregaJson() {
        File file = null;
        try {
            file = ResourceUtils.getFile("src/main/resources/static/food.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<AlimentoDTO>> ref = new TypeReference<>() {
        };
        List<AlimentoDTO> alimentoDTOList = null;
        try {
            alimentoDTOList = objectMapper.readValue(file, ref);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return alimentoDTOList;
    }
}
