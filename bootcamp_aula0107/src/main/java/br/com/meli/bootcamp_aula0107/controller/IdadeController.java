package br.com.meli.bootcamp_aula0107.controller;

import br.com.meli.bootcamp_aula0107.service.IdadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/idade")
public class IdadeController {

    @Autowired
    IdadeService idadeService;

    @GetMapping("/calcular/{dia}/{mes}/{ano}")
    public ResponseEntity<Integer> calcularIdade(@PathVariable(value = "dia") Integer dia, @PathVariable(value = "mes") Integer mes, @PathVariable(value = "ano") Integer ano) {
        return ResponseEntity.ok(idadeService.calcularIdade(dia, mes, ano));
    }

}
