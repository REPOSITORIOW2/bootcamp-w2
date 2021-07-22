package com.bootcamp.consultorio.entities;

import java.time.LocalTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Diary {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "start_time")
    private LocalTime start_time;

    @Column(name = "ending_time")
    private LocalTime ending_time;

    @ManyToOne
    @JoinColumn(name = "dentist_id")
    @JsonIgnore
    private Dentist dentist;

    @OneToMany(mappedBy = "diary")
    @JsonIgnore
    private List<Turn> turns;


    public Diary() {}

    public Diary(
            Long id,
            LocalTime start_time, 
            LocalTime ending_time, 
            Dentist dentist) {
        this.start_time = start_time;
        this.ending_time = ending_time;
        this.dentist = dentist;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalTime getStart_time() {
        return this.start_time;
    }

    public void setStart_time(LocalTime start_time) {
        this.start_time = start_time;
    }

    public LocalTime getEnding_time() {
        return this.ending_time;
    }

    public void setEnding_time(LocalTime ending_time) {
        this.ending_time = ending_time;
    }

    public Dentist getDentist() {
        return this.dentist;
    }

    public void setDentist(Dentist dentist) {
        this.dentist = dentist;
    }

    public List<Turn> getTurns() {
        return this.turns;
    }

    public void setTurns(List<Turn> turns) {
        this.turns = turns;
    }
}
