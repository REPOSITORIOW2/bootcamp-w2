package br.com.meli.odontology.odontology.forms;

import br.com.meli.odontology.odontology.entities.Turn;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PatientForm {
    private String name;
    private String lastName;
    private String address;
    private String dni;
    private String birthDate;
    private String phone;
    private String email;
}
