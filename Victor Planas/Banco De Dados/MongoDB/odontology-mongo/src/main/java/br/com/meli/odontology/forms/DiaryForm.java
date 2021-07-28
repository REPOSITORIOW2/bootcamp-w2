package br.com.meli.odontology.forms;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DiaryForm {
    private String idDentist;
    private String startTime;
    private String endingTime;



}
