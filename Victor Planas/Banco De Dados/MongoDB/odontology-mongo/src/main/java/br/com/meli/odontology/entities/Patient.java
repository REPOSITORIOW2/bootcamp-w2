package br.com.meli.odontology.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;


@Getter
@Setter
@Document(collection = "patients")
@NoArgsConstructor
public class Patient {
    @Id
    private String idPatient;
    private String name;
    @Field("last_name")
    private String lastName;
    private String address;
    private String dni;
    @Field("birth_date")
    private LocalDate birthDate;
    private String phone;
    private String email;
    @DBRef
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
