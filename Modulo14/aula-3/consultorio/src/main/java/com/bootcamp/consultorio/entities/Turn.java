package com.bootcamp.consultorio.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Turn {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate day;

    @ManyToOne
    @JoinColumn
    private Diary diary;

    @ManyToOne
    @JoinColumn
    private TurnStatus turnStatus;

    @ManyToOne
    @JoinColumn
    private Patient patient;


    public Turn() {}

    public Turn(
            Long id, 
            LocalDate day, 
            Diary diary,
            TurnStatus turnStatus, 
            Patient patient) {
        this.id = id;
        this.day = day;
        this.diary = diary;
        this.turnStatus = turnStatus;
        this.patient = patient;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDay() {
        return this.day;
    }

    public void setDay(LocalDate day) {
        this.day = day;
    }

    public Diary getDiary() {
        return this.diary;
    }

    public void setDiary(Diary diary) {
        this.diary = diary;
    }

    public TurnStatus getTurnStatus() {
        return this.turnStatus;
    }

    public void setTurnStatus(TurnStatus turnStatus) {
        this.turnStatus = turnStatus;
    }

    public Patient getPatient() {
        return this.patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
