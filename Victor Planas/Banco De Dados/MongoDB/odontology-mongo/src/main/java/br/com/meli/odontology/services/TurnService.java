package br.com.meli.odontology.services;

import br.com.meli.odontology.entities.Turn;
import br.com.meli.odontology.forms.TurnForm;
import br.com.meli.odontology.repositories.DiaryMongoRepository;
import br.com.meli.odontology.repositories.PatientMongoRepository;
import br.com.meli.odontology.repositories.TurnMongoRepository;
import br.com.meli.odontology.repositories.TurnStatusMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TurnService {
    @Autowired
    TurnMongoRepository turnMongoRepository;

    @Autowired
    TurnStatusMongoRepository turnStatusMongoRepository;

    @Autowired
    DiaryMongoRepository diaryMongoRepository;

    @Autowired
    PatientMongoRepository patientMongoRepository;

    public Turn addTurn(TurnForm Turn) {

        return turnMongoRepository.save(convertForm(Turn));
    }

    public List<Turn> listAllTurns() {
        return turnMongoRepository.findAll();
    }

    public Turn updateTurn(TurnForm Turn) {
        return turnMongoRepository.save(convertForm(Turn));
    }

    public void deleteTurnById(String id) {
        turnMongoRepository.deleteById(id);
    }

//    public List<Turn> listAllTurnsByStatus(Long status) {
//        return turnRepository.listAllTurnsByStatus(status);
//    }
//    public List<Turn> listAllTurnsByStatusByDate(Long status, String date) {
//        final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        return turnRepository.listAllTurnsByStatusByDate(status, LocalDate.parse(date,dtf));
//    }
//
//    public List<Turn> listAllTurnsByStatusByDentist(Dentist dentist) {
//        return turnRepository.listAllReescheduledByDentist(dentist);
//    }
//
//    public void reeschedule(Long idTurn, Turn newTurn) {
//        var turn = turnRepository.findById(idTurn).orElseThrow();
//        turn.setDay(newTurn.getDay());
//        turn.setTurnStatus(turnStatusRepository.getById(4L));
//
//
//    }
//
    private Turn convertForm(TurnForm form){
        var diary = diaryMongoRepository.findById(form.getIdDiary()).orElseThrow();
        var turnStatus = turnStatusMongoRepository.findById(form.getIdTurnStatus()).orElseThrow();
        var patient = patientMongoRepository.findById(form.getIdPatient()).orElseThrow();

        return new Turn(form.getDay(), diary, turnStatus, patient);
    }
//
//    public Turn setDiary(Long idTurn, Long idDiary) {
//        var turn = turnRepository.findById(idTurn).orElseThrow();
//        turn.setDiary(diaryRepository.findById(idDiary).orElseThrow());
//
//        return turn;
//    }
//
//    public Turn setStatus(Long idTurn, Long idStatus) {
//        var turn = turnRepository.findById(idTurn).orElseThrow();
//        turn.setTurnStatus(turnStatusRepository.findById(idStatus).orElseThrow());
//
//        return turn;
//    }
//
//    public Turn setPatient(Long idTurn, Long idPatient) {
//        var turn = turnRepository.findById(idTurn).orElseThrow();
//        turn.setPatient(patientRepository.findById(idPatient).orElseThrow());
//
//        return turn;
//    }
}
