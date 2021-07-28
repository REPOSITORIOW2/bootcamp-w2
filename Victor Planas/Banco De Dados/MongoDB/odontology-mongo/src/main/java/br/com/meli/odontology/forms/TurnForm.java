package br.com.meli.odontology.forms;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TurnForm {
    private String idDiary;
    private String idTurnStatus;
    private String idPatient;
    private String day;
}
