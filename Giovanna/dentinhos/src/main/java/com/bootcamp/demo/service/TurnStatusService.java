package com.bootcamp.demo.service;

import com.bootcamp.demo.model.TurnStatus;
import com.bootcamp.demo.repository.TurnStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TurnStatusService {
    @Autowired
    TurnStatusRepository turnStatusRepository;

    public TurnStatus addTurnStatus(TurnStatus TurnStatus) {
        return turnStatusRepository.save(TurnStatus);
    }

    public List<TurnStatus> listAllTurnStatus() {
        return turnStatusRepository.findAll();
    }

    public TurnStatus updateTurnStatus(TurnStatus TurnStatus) {
        return turnStatusRepository.save(TurnStatus);
    }

    public void deleteTurnStatusById(Long id) {
        turnStatusRepository.deleteById(id);
    }
}
