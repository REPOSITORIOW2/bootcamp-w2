package br.com.meli.apicalculadoracalorias.services;

import br.com.meli.apicalculadoracalorias.dto.FoodDTO;
import br.com.meli.apicalculadoracalorias.repositories.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {
    @Autowired
    private FoodRepository foodRepository;

    public List<FoodDTO> findAll() {
        return foodRepository.findAll();
    }

    public FoodDTO findByName(String name) {
        return foodRepository.findByName(name);
    }
}
