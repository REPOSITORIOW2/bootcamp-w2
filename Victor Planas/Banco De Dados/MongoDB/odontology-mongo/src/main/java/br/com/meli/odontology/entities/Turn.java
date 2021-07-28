package br.com.meli.odontology.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


@Getter
@Setter
@Document(collection = "turns")
@NoArgsConstructor
public class Turn {
    @Id
    private String IdTurn;
    private LocalDate day;
    @DBRef
    private Diary diary;
    @DBRef
    @Field("turn_status")
    private TurnStatus turnStatus;
    @DBRef
    private Patient patient;
    @DBRef
    private Turn rescheduled;

    public Turn(String day, Diary diary, TurnStatus turnStatus, Patient patient) {
        final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.day = LocalDate.parse(day,dtf);
        this.diary = diary;
        this.turnStatus = turnStatus;
        this.patient = patient;
    }
}
