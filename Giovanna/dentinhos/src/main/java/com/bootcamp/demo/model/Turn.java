package com.bootcamp.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="turns")
public class Turn {
    @Id
    @GeneratedValue
    private Long id_turn;
    private Date day;

    @ManyToOne
    @JoinColumn(name ="diary",nullable = false)
    private Diary diary;

    @ManyToOne
    @JoinColumn(name ="patient",nullable = false)
    private Patient patient;

    @ManyToOne
    @JoinColumn(name ="turn_status",nullable = false)
    private TurnStatus turn_status;
}
