package com.module6.class8.api.areacalculator.dto;

import com.module6.class8.api.areacalculator.dao.CasaDAO;
import com.module6.class8.api.areacalculator.entity.Casa;
import com.module6.class8.api.areacalculator.entity.Comodo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CasaDTO {
    private String nome;
    private String endereco;
    private List<Comodo> comodos = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Comodo> getComodos() {
        return comodos;
    }

    public void setComodos(List<Comodo> comodos) {
        this.comodos = comodos;
    }

    public CasaDTO(String nome, String endereco) {
        super();
        this.nome = nome;
        this.endereco = endereco;
    }

    public CasaDTO(Casa casa) {
        super();
        this.nome = casa.getNome();
        this.endereco = casa.getEndereco();
        this.comodos = casa.getComodos();
    }

    public static CasaDTO converter(Casa casa) {
        return new CasaDTO(casa);
    }

    public static Casa converter(CasaDTO casaDTO, CasaDAO casaDAO) {
        return new Casa(casaDAO.getList().size() + 1, casaDTO.getNome(), casaDTO.getEndereco(), casaDTO.getComodos());
    }

    public static List<CasaDTO> converter(List<Casa> casas) {
        return casas.stream().map(c -> new CasaDTO(c)).collect(Collectors.toList());
    }
}
