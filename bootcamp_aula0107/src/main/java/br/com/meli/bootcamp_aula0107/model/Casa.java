package br.com.meli.bootcamp_aula0107.model;

import br.com.meli.bootcamp_aula0107.model.dto.CasaDTO;
import org.springframework.boot.context.properties.bind.Name;

import java.util.List;
import java.util.stream.Collectors;

public class Casa {

    private String nome;
    private String endereco;

    private List<Comodo> comodos;

    public Casa() {
    }

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

    public CasaDTO converteParaDTO() {
        CasaDTO casaDTO = new CasaDTO();
        casaDTO.setComodos(comodos.stream().map(Comodo::converteParaDTO).collect(Collectors.toList()));
        casaDTO.setEndereco(endereco);
        casaDTO.setNome(nome);
        casaDTO.atualizaDados();

        return casaDTO;
    }
}
