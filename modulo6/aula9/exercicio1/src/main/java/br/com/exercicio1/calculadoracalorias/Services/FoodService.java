package br.com.exercicio1.calculadoracalorias.Services;

import br.com.exercicio1.calculadoracalorias.Entities.Food;
import br.com.exercicio1.calculadoracalorias.Respositories.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodService {
    @Autowired
    private FoodRepository foodRepository;

    FoodService(FoodRepository repository) {
        foodRepository = repository;
    }

    public void adicionarFood(Food food){
        this.foodRepository.adicionar(food);
    }
}
