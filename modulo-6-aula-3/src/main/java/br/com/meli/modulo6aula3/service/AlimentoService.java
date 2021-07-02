package br.com.meli.modulo6aula3.service;

import br.com.meli.modulo6aula3.entity.dto.AlimentoDTO;
import br.com.meli.modulo6aula3.repository.AlimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

@Service
public class AlimentoService {

  @Autowired
  AlimentoRepository alimentoRepository;

  public List<AlimentoDTO> listAlimentos() {
    try {
      return alimentoRepository.listar();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }

  public AlimentoDTO getAlimento(String name) {
    try {
      return alimentoRepository.getAlimento(name);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }

  public AlimentoDTO addAlimento(AlimentoDTO alimentoDTO) {
    try {
      return alimentoRepository.addAlimento(alimentoDTO);
    } catch (IOException | URISyntaxException e) {
      e.printStackTrace();
    }
    return alimentoDTO;
  }
}
