package br.com.meli.odontology.odontology.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "diarys")
@NoArgsConstructor
public class Diary {
    @Id
    @GeneratedValue
    private Long idDiary;
    private LocalTime startTime;
    private LocalTime endingTime;
    @ManyToOne
    @JoinColumn(name="id_dentist", nullable = true)
    private Dentist dentist;
    @OneToMany(mappedBy = "diary")
    @JsonIgnore
    private List<Turn> turns;

    public Diary(Dentist dentist, String startTime, String endingTime) {
        this.dentist = dentist;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        this.startTime = LocalTime.parse(startTime,dtf);
        this.endingTime = LocalTime.parse(endingTime,dtf);
    }


}
