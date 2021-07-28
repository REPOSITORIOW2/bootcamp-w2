package com.example.mongodb.model;


import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document("turn_status")
public class TurnStatus {
    @Id
    @GeneratedValue
    private String id_turn_status;
    @Field
    private String name;
    @Field
    private String description;

}
