package br.com.meli.odontology.responses;


import br.com.meli.odontology.entities.Patient;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


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