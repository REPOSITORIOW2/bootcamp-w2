package br.com.meli.odontology.odontology.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Entity
@Getter
@Setter
@Table(name = "turns")
@NoArgsConstructor
public class Turn {
    @Id
    @GeneratedValue
    private Long IdTurn;
    private LocalDate day;
    @ManyToOne
    @JoinColumn(name = "id_diary", nullable = false)
    private Diary diary;
    @ManyToOne
    @JoinColumn(name = "id_turn_status", nullable = false)
    private TurnStatus turnStatus;
    @ManyToOne
    @JoinColumn(name = "id_patient", nullable = false)
    private Patient patient;
    @OneToOne
    private Turn rescheduled;

    public Turn(String day, Diary diary, TurnStatus turnStatus, Patient patient) {
        final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.day = LocalDate.parse(day,dtf);
        this.diary = diary;
        this.turnStatus = turnStatus;
        this.patient = patient;
    }
}
