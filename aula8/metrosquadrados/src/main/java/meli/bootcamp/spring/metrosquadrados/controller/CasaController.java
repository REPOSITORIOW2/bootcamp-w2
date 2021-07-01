package meli.bootcamp.spring.metrosquadrados.controller;

import meli.bootcamp.spring.metrosquadrados.domain.Casa;
import meli.bootcamp.spring.metrosquadrados.domain.Comodo;
import meli.bootcamp.spring.metrosquadrados.dto.ComodoDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/casa")
public class CasaController {

    private Casa casa;

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResponseEntity create(@RequestBody Casa incomingCasa){
        this.casa = new Casa(incomingCasa.getNome(), incomingCasa.getEndereco());

        if (!incomingCasa.getComodos().isEmpty()){
            for (Comodo comodo: incomingCasa.getComodos()) {
                this.casa.addComodo(comodo);
            }
        }

        return new ResponseEntity(HttpStatus.CREATED);
    }

    @RequestMapping(value = "/total-area", method = RequestMethod.GET)
    public double getTotalMetros(){
        return this.casa.getAreaTotal();
    }

    @RequestMapping(value = "/valor", method = RequestMethod.GET)
    public double getValorTotal(){
        return this.casa.preco();
    }

    @RequestMapping(value = "/maior-comodo", method = RequestMethod.GET)
    public ResponseEntity<ComodoDTO> getMaiorComodo(){
        var comodo = this.casa.maiorComodo();

        if (comodo.isPresent())
            return new ResponseEntity<>(new ComodoDTO(comodo.get()), HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(value = "/comodos", method = RequestMethod.GET)
    public List<ComodoDTO> getTodosComodos(){
        var comodos =  casa.getComodos();

        List<ComodoDTO> comodoDTOs = new ArrayList<>();

        for (Comodo comodo: comodos) {
            comodoDTOs.add(new ComodoDTO(comodo));
        }

        return comodoDTOs;
    }
}
