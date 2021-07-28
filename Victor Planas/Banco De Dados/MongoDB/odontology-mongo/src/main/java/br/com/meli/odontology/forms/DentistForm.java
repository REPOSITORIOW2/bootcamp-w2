package br.com.meli.odontology.forms;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
