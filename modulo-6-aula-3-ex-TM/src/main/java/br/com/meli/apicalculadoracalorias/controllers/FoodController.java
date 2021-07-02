package br.com.meli.apicalculadoracalorias.controllers;

import br.com.meli.apicalculadoracalorias.dto.FoodDTO;
import br.com.meli.apicalculadoracalorias.services.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FoodController {
    @Autowired
    private FoodService foodService;

    @GetMapping("/food")
    @ResponseBody
    public List<FoodDTO> findAll() {
        return foodService.findAll();
    }

    @GetMapping("/food/{name}")
    @ResponseBody
    public FoodDTO findByName(@PathVariable String name) {
        return foodService.findByName(name);
    }
}
