package br.com.meli.odontology.odontology.services;

import br.com.meli.odontology.odontology.entities.Dentist;
import br.com.meli.odontology.odontology.entities.Turn;
import br.com.meli.odontology.odontology.entities.TurnStatus;
import br.com.meli.odontology.odontology.forms.TurnForm;
import br.com.meli.odontology.odontology.repositories.DiaryRepository;
import br.com.meli.odontology.odontology.repositories.PatientRepository;
import br.com.meli.odontology.odontology.repositories.TurnRepository;
import br.com.meli.odontology.odontology.repositories.TurnStatusRepository;
import javassist.NotFoundException;
import org.apache.tomcat.jni.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class TurnService {
    @Autowired
    TurnRepository turnRepository;

    @Autowired
    TurnStatusRepository turnStatusRepository;

    @Autowired
    DiaryRepository diaryRepository;

    @Autowired
    PatientRepository patientRepository;

    public Turn addTurn(TurnForm Turn) {

        return turnRepository.save(convertForm(Turn));
    }

    public List<Turn> listAllTurns() {
        return turnRepository.findAll();
    }

    public Turn updateTurn(TurnForm Turn) {
        return turnRepository.save(convertForm(Turn));
    }

    public void deleteTurnById(Long id) {
        turnRepository.deleteById(id);
    }

    public List<Turn> listAllTurnsByStatus(Long status) {
        return turnRepository.listAllTurnsByStatus(status);
    }
    public List<Turn> listAllTurnsByStatusByDate(Long status, String date) {
        final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return turnRepository.listAllTurnsByStatusByDate(status, LocalDate.parse(date,dtf));
    }

    public List<Turn> listAllTurnsByStatusByDentist(Dentist dentist) {
        return turnRepository.listAllReescheduledByDentist(dentist);
    }

    public void reeschedule(Long idTurn, Turn newTurn) {
        var turn = turnRepository.findById(idTurn).orElseThrow();
        turn.setDay(newTurn.getDay());
        turn.setTurnStatus(turnStatusRepository.getById(4L));


    }

    private Turn convertForm(TurnForm form){
        var diary = diaryRepository.findById(form.getIdDiary()).orElseThrow();
        var turnStatus = turnStatusRepository.findById(form.getIdTurnStatus()).orElseThrow();
        var patient = patientRepository.findById(form.getIdPatient()).orElseThrow();

        return new Turn(form.getDay(), diary, turnStatus, patient);
    }

    public Turn setDiary(Long idTurn, Long idDiary) {
        var turn = turnRepository.findById(idTurn).orElseThrow();
        turn.setDiary(diaryRepository.findById(idDiary).orElseThrow());

        return turn;
    }

    public Turn setStatus(Long idTurn, Long idStatus) {
        var turn = turnRepository.findById(idTurn).orElseThrow();
        turn.setTurnStatus(turnStatusRepository.findById(idStatus).orElseThrow());

        return turn;
    }

    public Turn setPatient(Long idTurn, Long idPatient) {
        var turn = turnRepository.findById(idTurn).orElseThrow();
        turn.setPatient(patientRepository.findById(idPatient).orElseThrow());

        return turn;
    }
}
