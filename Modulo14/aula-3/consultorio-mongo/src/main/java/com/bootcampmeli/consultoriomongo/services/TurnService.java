package com.bootcampmeli.consultoriomongo.services;

import java.time.LocalDateTime;
import java.util.List;

import com.bootcampmeli.consultoriomongo.dtos.DentistDTO;
import com.bootcampmeli.consultoriomongo.dtos.PatientDTO;
import com.bootcampmeli.consultoriomongo.dtos.UpsertTurnDTO;
import com.bootcampmeli.consultoriomongo.entities.Dentist;
import com.bootcampmeli.consultoriomongo.entities.Patient;
import com.bootcampmeli.consultoriomongo.entities.Turn;
import com.bootcampmeli.consultoriomongo.enums.TurnStatusEnum;
import com.bootcampmeli.consultoriomongo.repositories.TurnRepository;

import org.springframework.stereotype.Service;

@Service
public class TurnService {

    private TurnRepository turnRepository;

    
    public TurnService(TurnRepository turnRepository) {
        this.turnRepository = turnRepository;
    }

    public List<Turn> getAllTurns() {
        return this.turnRepository.findAll();
    }

    public List<Turn> getTurnWithStatus(String status){
        return this.turnRepository.findByStatus(status);
    }

    public List<Turn> getTurnsByDentistLastName(String lastName) {
		return this.turnRepository.findByDentistLastName(lastName);
	}

	public Turn createTurn(UpsertTurnDTO upsertTurnDTO) {
        PatientDTO patientDTO = upsertTurnDTO.getPatient();
        Patient patient = new Patient(
            patientDTO.getFirstName(),
            patientDTO.getLastName(),
            patientDTO.getAge(),
            patientDTO.getGender()
        );

        DentistDTO dentistDTO = upsertTurnDTO.getDoctor();
        Dentist dentist = new Dentist(
            dentistDTO.getFirstName(),
            dentistDTO.getLastName(),
            dentistDTO.getLastName()
        );
        
        LocalDateTime date = upsertTurnDTO.getDate();
        TurnStatusEnum status = upsertTurnDTO.getStatus();
        
        Turn turn = new Turn(patient, dentist, date, status);
        Turn savedTurn = this.turnRepository.save(turn);
        
        return savedTurn;
	}
}
