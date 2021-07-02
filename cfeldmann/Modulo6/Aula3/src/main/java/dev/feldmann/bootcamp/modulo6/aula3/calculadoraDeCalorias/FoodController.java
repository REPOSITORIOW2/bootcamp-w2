package dev.feldmann.bootcamp.modulo6.aula3.calculadoraDeCalorias;


import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/foods")
public class FoodController {

    @Autowired
    private FoodService service;

    @SneakyThrows
    @GetMapping()
    public List<Food> getAllFoods() {
        return service.getList();
    }

    @SneakyThrows
    @GetMapping("/{foodName}")
    public ResponseEntity<Food> getFoodByName(@PathVariable String foodName) {
        var food = service.getList()
                .stream()
                .filter(f -> f.getName().equalsIgnoreCase(foodName))
                .findFirst();
        if (food.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(food.get());
    }

}
