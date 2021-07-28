package br.com.meli.odontology.services;


import br.com.meli.odontology.entities.TurnStatus;
import br.com.meli.odontology.repositories.TurnStatusMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TurnStatusService {
    @Autowired
    TurnStatusMongoRepository turnStatusMongoRepository;

    public TurnStatus addTurnStatus(TurnStatus TurnStatus) {
        return turnStatusMongoRepository.save(TurnStatus);
    }

    public List<TurnStatus> listAllTurnStatuss() {
        return turnStatusMongoRepository.findAll();
    }

    public TurnStatus updateTurnStatus(TurnStatus TurnStatus) {
        return turnStatusMongoRepository.save(TurnStatus);
    }

    public void deleteTurnStatusById(String id) {
        turnStatusMongoRepository.deleteById(id);
    }
}
