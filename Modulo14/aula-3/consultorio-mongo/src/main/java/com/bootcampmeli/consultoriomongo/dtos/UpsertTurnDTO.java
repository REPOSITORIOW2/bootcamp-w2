package com.bootcampmeli.consultoriomongo.dtos;

import java.time.LocalDateTime;

import com.bootcampmeli.consultoriomongo.enums.TurnStatusEnum;

public class UpsertTurnDTO {

    private PatientDTO patient;
    private DentistDTO doctor;
    private LocalDateTime date;
    private TurnStatusEnum status;
    

    public UpsertTurnDTO() {}

    public UpsertTurnDTO(
            PatientDTO patient, 
            DentistDTO doctor, 
            LocalDateTime date, 
            TurnStatusEnum status) {
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
        this.status = status;
    }

    public PatientDTO getPatient() {
        return this.patient;
    }

    public void setPatient(PatientDTO patient) {
        this.patient = patient;
    }

    public DentistDTO getDoctor() {
        return this.doctor;
    }

    public void setDoctor(DentistDTO doctor) {
        this.doctor = doctor;
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
