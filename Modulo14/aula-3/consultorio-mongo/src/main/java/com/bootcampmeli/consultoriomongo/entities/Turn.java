package com.bootcampmeli.consultoriomongo.entities;

import java.time.LocalDateTime;

import com.bootcampmeli.consultoriomongo.enums.TurnStatusEnum;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "turns")
public class Turn {

    @Id
    private String id;

    @Field(name = "patient")
    private Patient patient;

    @Field(name = "dentist")
    private Dentist dentist;
    private LocalDateTime date;
    private TurnStatusEnum status; 
     

    public Turn() {}

    public Turn(
            Patient patient, 
            Dentist dentist, 
            LocalDateTime date, 
            TurnStatusEnum status) {
        this.patient = patient;
        this.dentist = dentist;
        this.date = date;
        this.status = status;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Patient getPatient() {
        return this.patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Dentist getDentist() {
        return this.dentist;
    }

    public void setDentist(Dentist dentist) {
        this.dentist = dentist;
    }

    public LocalDateTime getDate() {
        return this.date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public TurnStatusEnum getStatus() {
        return this.status;
    }

    public void setStatus(TurnStatusEnum status) {
        this.status = status;
    }
}
