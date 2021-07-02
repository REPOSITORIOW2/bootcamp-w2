package br.com.meli.modulo6aula3.controller;

import br.com.meli.modulo6aula3.entity.Alimento;
import br.com.meli.modulo6aula3.entity.dto.AlimentoDTO;
import br.com.meli.modulo6aula3.service.AlimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alimento")
public class AlimentoController {

  @Autowired
  AlimentoService service;

  @GetMapping("/")
  public ResponseEntity<List<AlimentoDTO>> listar(){
    List<AlimentoDTO> lista = service.listAlimentos();

    return ResponseEntity.ok(lista);
  }

  @GetMapping("/buscar/{name}")
  public ResponseEntity<AlimentoDTO> getAlimento(@PathVariable(value = "name") String name){
    return ResponseEntity.ok(service.getAlimento(name));
  }

  @PostMapping("/adicionar")
  public ResponseEntity<AlimentoDTO> addAlimento(@RequestBody AlimentoDTO alimentoDTO) {
    AlimentoDTO alimento = service.addAlimento(alimentoDTO);

    return ResponseEntity.ok(alimentoDTO);
  }
}
