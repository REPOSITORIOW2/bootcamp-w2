package com.example.mongodb.service;


import com.example.mongodb.model.TurnStatus;
import com.example.mongodb.repository.TurnStatusRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class TurnStatusService {
    private final
    TurnStatusRepository turnStatusRepository;

    public TurnStatus addTurnStatus(TurnStatus TurnStatus) {
        return turnStatusRepository.insert(TurnStatus);
    }

    public List<TurnStatus> listAllTurnStatus() {
        return turnStatusRepository.findAll();
    }

    public TurnStatus updateTurnStatus(TurnStatus TurnStatus) {
        return turnStatusRepository.insert(TurnStatus);
    }

    public void deleteTurnStatusById(String id) {
        turnStatusRepository.deleteById(id);
    }
}
