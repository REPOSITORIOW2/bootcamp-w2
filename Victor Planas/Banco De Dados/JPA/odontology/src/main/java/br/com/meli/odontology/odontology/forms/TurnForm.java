package br.com.meli.odontology.odontology.forms;

import br.com.meli.odontology.odontology.entities.Diary;
import br.com.meli.odontology.odontology.entities.Patient;
import br.com.meli.odontology.odontology.entities.TurnStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TurnForm {
    private Long idDiary;
    private Long idTurnStatus;
    private Long idPatient;
    private String day;
}
