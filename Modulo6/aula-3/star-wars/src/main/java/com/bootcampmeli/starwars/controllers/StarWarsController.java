package com.bootcampmeli.starwars.controllers;

import com.bootcampmeli.starwars.services.StarWarsService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("star-wars")
public class StarWarsController {

    private final StarWarsService starWarsService;

    public StarWarsController(StarWarsService starWarsService) {
        this.starWarsService = starWarsService;
    }

    @GetMapping("{name}")
    public String getStarWarsCharacters(@PathVariable String name) {
        return this.starWarsService.getMatchingCharacters(name);
    }
}