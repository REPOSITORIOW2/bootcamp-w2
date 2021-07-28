package br.com.meli.odontology.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Setter
@Getter

@Document(collection = "dentists")
@NoArgsConstructor
public class Dentist {

    @Id
    private String idDentist;
    private String name;
    @Field("last_name")
    private String lastName;
    private String address;
    private String dni;
    @Field("birth_date")
    private LocalDate birthDate;
    private String phone;
    private String email;
    @Field("code_mp")
    private String codeMp;
    @DBRef
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
