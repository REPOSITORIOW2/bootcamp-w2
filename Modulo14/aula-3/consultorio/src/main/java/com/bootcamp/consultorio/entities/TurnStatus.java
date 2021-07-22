package com.bootcamp.consultorio.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.bootcamp.consultorio.enums.TurnStatusEnum;

@Entity
public class TurnStatus {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "name")
    private TurnStatusEnum name;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "turnStatus")
    private List<Turn> turns = new ArrayList<>();


    public TurnStatus() {}

    public TurnStatus(
            Long id, 
            TurnStatusEnum name, 
            String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TurnStatusEnum getName() {
        return this.name;
    }

    public void setName(TurnStatusEnum name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Turn> getTurns() {
        return this.turns;
    }

    public void setTurns(List<Turn> turns) {
        this.turns = turns;
    }
}
