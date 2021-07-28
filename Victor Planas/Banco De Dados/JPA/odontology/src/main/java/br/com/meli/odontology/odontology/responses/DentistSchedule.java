package br.com.meli.odontology.odontology.responses;

import br.com.meli.odontology.odontology.entities.Dentist;
import br.com.meli.odontology.odontology.entities.Patient;
import br.com.meli.odontology.odontology.entities.Turn;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;


@Getter
public class DentistSchedule {

    private LocalDateTime start;
    private LocalDateTime end;
    private Patient patient;

    public DentistSchedule(LocalDate date,
                                LocalTime startTime,
                                LocalTime endTime,
                                Patient patient) {

        this.start = startTime.atDate(date);
        this.end = endTime.atDate(date);
        this.patient = patient;
    }

}