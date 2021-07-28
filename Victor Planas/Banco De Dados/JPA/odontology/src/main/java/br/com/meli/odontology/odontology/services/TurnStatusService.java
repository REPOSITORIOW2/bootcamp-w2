package br.com.meli.odontology.odontology.services;

import br.com.meli.odontology.odontology.entities.TurnStatus;
import br.com.meli.odontology.odontology.repositories.TurnStatusRepository;
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

    public List<TurnStatus> listAllTurnStatuss() {
        return turnStatusRepository.findAll();
    }

    public TurnStatus updateTurnStatus(TurnStatus TurnStatus) {
        return turnStatusRepository.save(TurnStatus);
    }

    public void deleteTurnStatusById(Long id) {
        turnStatusRepository.deleteById(id);
    }
}
