package com.example.mongodb.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.*;
import java.time.LocalTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document("diarys")
public class Diary {
    @Id
    @GeneratedValue
    private String id_diary;
    @Field
    private LocalTime start_Time;
    @Field
    private LocalTime  ending_Time;

}
