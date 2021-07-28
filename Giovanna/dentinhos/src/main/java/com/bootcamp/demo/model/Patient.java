package com.bootcamp.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="patients")
public class Patient {
    @Id
    @GeneratedValue
    private Long id_patient;
    private String name;
    private String last_name;
    private String address;
    private String dni;
    private Date birth_date;
    private String phone;
    private String email;
}
