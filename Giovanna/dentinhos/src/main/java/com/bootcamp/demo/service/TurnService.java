package com.bootcamp.demo.service;

import com.bootcamp.demo.model.Turn;
import com.bootcamp.demo.repository.TurnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TurnService {
    @Autowired
    TurnRepository turnRepository;

    public Turn addTurn(Turn Turn) {
        return turnRepository.save(Turn);
    }

    public List<Turn> listAllTurns() {
        return turnRepository.findAll();
    }

    public Turn updateTurn(Turn Turn) {
        return turnRepository.save(Turn);
    }

    public void deleteTurnById(Long id) {
        turnRepository.deleteById(id);
    }
}