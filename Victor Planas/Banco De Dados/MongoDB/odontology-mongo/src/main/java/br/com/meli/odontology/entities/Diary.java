package br.com.meli.odontology.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Getter
@Setter

@Document(collection = "diarys")
@NoArgsConstructor
public class Diary {
    @Id
    private String idDiary;
    @Field("start_time")
    private LocalTime startTime;
    @Field("ending_time")
    private LocalTime endingTime;
    @DBRef
    private Dentist dentist;
    @DBRef
    @JsonIgnore
    private List<Turn> turns;

    public Diary(Dentist dentist, String startTime, String endingTime) {
        this.dentist = dentist;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        this.startTime = LocalTime.parse(startTime,dtf);
        this.endingTime = LocalTime.parse(endingTime,dtf);
    }


}
