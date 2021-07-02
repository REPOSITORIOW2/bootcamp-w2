package br.com.meli.bootcamp_aula0107.controller;

import br.com.meli.bootcamp_aula0107.model.Casa;
import br.com.meli.bootcamp_aula0107.model.dto.CasaDTO;
import br.com.meli.bootcamp_aula0107.service.CasaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/casa")
public class CasaController {

    @Autowired
    CasaService casaService;

    @PostMapping("/cadastrar")
    public ResponseEntity<CasaDTO> cadastraCasa(@RequestBody Casa casa) {
        return ResponseEntity.ok(casaService.cadastraCasa(casa));
    }

}
