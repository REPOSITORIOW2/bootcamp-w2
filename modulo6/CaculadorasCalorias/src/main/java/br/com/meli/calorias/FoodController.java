package br.com.meli.calorias;

import br.com.meli.calorias.entity.Food;
import br.com.meli.calorias.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {

    private final FoodRepository fr;

    @Autowired
    public FoodController(FoodRepository fr) {
        this.fr = fr;
    }

    @GetMapping("/")
    public List<Food> getAll(){
        return fr.getAll();
    }

    @GetMapping("/find/{value}")
    public Food find(@PathVariable String value){
        return fr.find(value);
    }

}
