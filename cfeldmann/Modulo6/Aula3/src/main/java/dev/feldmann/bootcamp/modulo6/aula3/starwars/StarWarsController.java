package dev.feldmann.bootcamp.modulo6.aula3.starwars;


import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Size;
import java.util.List;

@Validated
@RestController
@RequestMapping("/starwars")
public class StarWarsController {

    @Autowired
    private StarWarsService service;


    @SneakyThrows
    @GetMapping("/{name}")
    public ResponseEntity<List<StarwarsCharacter>> getCharacterByName(@Size(min = 3) @PathVariable String name) {
        var characters = service.searchByName(name);
        return ResponseEntity.ok(characters);
    }

}
