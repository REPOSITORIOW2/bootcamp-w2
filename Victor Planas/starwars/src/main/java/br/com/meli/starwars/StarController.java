package br.com.meli.starwars;

import br.com.meli.starwars.entity.PersonagemDTO;
import br.com.meli.starwars.service.StarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/starwars")
public class StarController {

    @Autowired
    private StarService service;

    @GetMapping("/retornaNome/{name}")
    public PersonagemDTO getPersonagemByNamePart(@PathVariable String name){
        return service.getPersonagemByNamePart(name);
    }
}
