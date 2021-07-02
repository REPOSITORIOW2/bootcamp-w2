package com.example.idade.controller;

import com.example.idade.service.Idade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/idade")
public class IdadeContro {

    @GetMapping("/{dia}/{mes}/{ano}")
    public ResponseEntity<Map<String, Integer>> calcYear(@PathVariable Integer dia,
                                                         @PathVariable Integer mes,
                                                         @PathVariable Integer ano){
        Map<String, Integer> ret = new HashMap<>();
        ret.put("retorno", Idade.calcYear(dia, mes, ano));

        return ResponseEntity.ok(ret);
    }

}
