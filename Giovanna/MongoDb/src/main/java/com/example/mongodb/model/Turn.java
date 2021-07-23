package com.example.mongodb.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document("turns")
public class Turn {
    @Id
    @GeneratedValue
    private String id_turn;
    @Field
    private Date day;

}
