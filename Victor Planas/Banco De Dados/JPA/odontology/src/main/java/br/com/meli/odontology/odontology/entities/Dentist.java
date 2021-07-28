package br.com.meli.odontology.odontology.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Setter
@Getter
@Entity
@Table(name="dentists")
@NoArgsConstructor
public class Dentist {
    @Id
    @GeneratedValue
    private Long idDentist;
    private String name;
    private String lastName;
    private String address;
    private String dni;
    private LocalDate birthDate;
    private String phone;
    private String email;
    private String codeMp;
    @OneToMany(mappedBy="dentist")
//    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "idDiary")
//    @JsonIdentityReference(alwaysAsId = true)
    @JsonIgnore
    private List<Diary> diaries;

    public Dentist( String name, String lastName, String address, String dni, String birthDate, String phone, String email, String codeMp) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.dni = dni;
        final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.birthDate = LocalDate.parse(birthDate,dtf);
        this.phone = phone;
        this.email = email;
        this.codeMp = codeMp;
    }
}
