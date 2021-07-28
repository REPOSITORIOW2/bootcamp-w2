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
@Document("users")
public class User {
    @Id
    @GeneratedValue
    private String id_user;
    @Field
    private String user_name;
    @Field
    private String password;
    @Field
    private String userStatus;
}
