package com.example.mongodb.service;


import com.example.mongodb.model.Turn;
import com.example.mongodb.repository.TurnRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class TurnService {
    private final
    TurnRepository turnRepository;

    public Turn addTurn(Turn Turn) {
        return turnRepository.insert(Turn);
    }

    public List<Turn> listAllTurns() {
        return turnRepository.findAll();
    }

    public Turn updateTurn(Turn Turn) {
        return turnRepository.insert(Turn);
    }

    public void deleteTurnById(String id) {
        turnRepository.deleteById(id);
    }
}