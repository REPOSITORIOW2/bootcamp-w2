package com.bootcamp.consultorio.services;

import java.time.LocalDate;
import java.util.List;

import com.bootcamp.consultorio.entities.Dentist;
import com.bootcamp.consultorio.entities.Diary;
import com.bootcamp.consultorio.entities.Patient;
import com.bootcamp.consultorio.entities.Turn;
import com.bootcamp.consultorio.repositories.ConsultorioRepository;
import com.bootcamp.consultorio.repositories.DentistRepository;
import com.bootcamp.consultorio.repositories.DiaryRepository;
import com.bootcamp.consultorio.repositories.PatientRepository;
import com.bootcamp.consultorio.repositories.TurnRepository;

import org.springframework.stereotype.Service;

@Service
public class ConsultorioService {

    private ConsultorioRepository consultorioRepository;
    private PatientRepository patientRepository;
    private DentistRepository dentistRepository;
    private TurnRepository turnRepository;
    private DiaryRepository diaryRepository;

    public ConsultorioService(
            ConsultorioRepository consultorioRepository,
            PatientRepository patientRepository,
            DentistRepository dentistRepository,
            TurnRepository turnRepository,
            DiaryRepository diaryRepository) {
        this.consultorioRepository = consultorioRepository;
        this.patientRepository = patientRepository;
        this.dentistRepository = dentistRepository;
        this.turnRepository = turnRepository;
        this.diaryRepository = diaryRepository;
    }

    public List<Patient> getAllPatients() {
        return this.patientRepository.getAllPatients();
    }

	public List<Patient> getAllPatientsOfTheDay(LocalDate day) {
        return this.patientRepository.getAllPatientsOfTheDay(day);
	}

	public List<Dentist> getAllDentistsWithMoreThanTwoTurns(LocalDate day) {
        return this.dentistRepository.getAllDentistsWithMoreThanTwoTurns(day);
	}

    public List<Turn> findAllCompletedTurns() {
        return this.turnRepository.findAllCompletedTurns();
    }

    public List<Turn> getTurnsWithPendingStatusInASpecificDay(LocalDate day) {
        return this.turnRepository.getTurnsWithPendingStatusInASpecificDay(day);
    }

    public List<Diary> getDiaryOfADentist(Long dentistId) {
        return this.diaryRepository.getDiaryOfADentist(dentistId);
    }

	public List<Turn> getAllRescheduledTurns(Long dentistId) {
		return this.turnRepository.getAllRescheduledTurns(dentistId);
	}
}
