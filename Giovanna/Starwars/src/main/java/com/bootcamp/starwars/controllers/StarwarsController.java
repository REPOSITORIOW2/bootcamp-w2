package com.bootcamp.starwars.controllers;

import com.bootcamp.starwars.service.StarwarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/starwars")
public class StarwarsController {

    @Autowired
    StarwarsService service;

    @GetMapping("/getByAlias/{alias}")
    public List<String> getByAlias(@PathVariable String alias){
        return service.getByAlias(alias);
    }

}
