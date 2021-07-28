package br.com.meli.odontology.odontology.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "patients")
@NoArgsConstructor
public class Patient {
    @Id
    @GeneratedValue
    private Long idPatient;
    private String name;
    private String lastName;
    private String address;
    private String dni;
    private LocalDate birthDate;
    private String phone;
    private String email;
    @OneToMany(mappedBy = "patient")
    @JsonIgnore
    private List<Turn> turns;

    public Patient(String name, String lastName, String address, String dni, String birthDate, String phone, String email) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.dni = dni;
        final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.birthDate = LocalDate.parse(birthDate,dtf);
        this.phone = phone;
        this.email = email;
    }
}
