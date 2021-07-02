package br.com.meli.bootcamp.calculatorhouse.controllers;

import br.com.meli.bootcamp.calculatorhouse.dao.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/house")
public class house {

    @PostMapping("/value")
    public ResponseEntity<DTOHouse> valueHouse(@RequestBody DAOHouse casa) {
        return ResponseEntity.ok().body(new DTOHouse("houseValue", casa.valueHouse()));
    }

    @PostMapping("/meter")
    public ResponseEntity<DTOHouse> metricHouse(@RequestBody DAOHouse casa) {
        return ResponseEntity.ok().body(new DTOHouse("houseValue", casa.squareMeterHouse()));
    }

    @PostMapping("/biggestroom")
    public ResponseEntity<DTORoom> biggestRoom(@RequestBody DAOHouse casa) {
        return ResponseEntity.ok().body(new DTORoom("houseValue", casa.biggestRoom()));
    }

    @PostMapping("/sizerooms")
    public ResponseEntity<List<DTORoomSize>> sizeRoom(@RequestBody DAOHouse casa) {
        return ResponseEntity.ok().body(casa.roomSizes());
    }

}
