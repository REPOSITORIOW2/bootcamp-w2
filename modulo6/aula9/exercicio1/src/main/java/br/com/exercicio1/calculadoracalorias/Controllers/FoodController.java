package br.com.exercicio1.calculadoracalorias.Controllers;

import br.com.exercicio1.calculadoracalorias.Entities.Food;
import br.com.exercicio1.calculadoracalorias.Entities.Ingrediente;
import br.com.exercicio1.calculadoracalorias.Services.FoodService;
import br.com.exercicio1.calculadoracalorias.Services.IngredienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {
    @Autowired
    private IngredienteService ingredienteService;

    @Autowired
    private FoodService foodService;


    @PostMapping
    ResponseEntity<Food> adicionar(@RequestBody Food food) {
        try{
            this.foodService.adicionarFood(food);
            return new ResponseEntity<>(null, HttpStatus.CREATED);
        } catch(Exception err) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping
    ResponseEntity<List<Ingrediente>> ObterListaIngredientes() {
        try {
            List<Ingrediente> listaIngredientes = new ArrayList<>();
            listaIngredientes = ingredienteService.obterLista();
            if (listaIngredientes.isEmpty()){
                return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<List<Ingrediente>>(listaIngredientes, HttpStatus.OK);

        } catch (Exception err) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping
    @RequestMapping("{nome}")
    ResponseEntity<Ingrediente> ObterIngrediente(@PathVariable String nome) {
        try {
            Ingrediente ingrediente = new Ingrediente();
            ingrediente = ingredienteService.obterIngrediente(nome);
            if (ingrediente == null){
                return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<Ingrediente>(ingrediente, HttpStatus.OK);

        } catch (Exception err) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }
}
