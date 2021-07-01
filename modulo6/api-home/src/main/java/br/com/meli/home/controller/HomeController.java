package br.com.meli.home.controller;

import br.com.meli.home.dto.HomeDTO;
import br.com.meli.home.entity.Home;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public HomeDTO endpoint(@RequestBody Home home){

        return new HomeDTO().convert(home);

    }

}
