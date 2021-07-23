package com.example.mongodb.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.GeneratedValue;
import java.util.Date;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document("dentist")
public class Dentist {

    @Id
    @GeneratedValue
    private String id_dentist;
    @Field
    private String name;
    @Field
    private String last_name;
    @Field
    private String address;
    @Field
    private String dni;
    @Field
    private Date birth_date;
    @Field
    private String phone;
    @Field
    private String email;
    @Field
    private String code_mp;

}