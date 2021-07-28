package br.com.meli.odontology.odontology.forms;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DentistForm {
    private String name;
    private String lastName;
    private String address;
    private String dni;
    private String birthDate;
    private String phone;
    private String email;
    private String codeMp;
}
