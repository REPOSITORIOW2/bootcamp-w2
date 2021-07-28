package br.com.meli.odontology.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


import java.util.List;


@Getter
@Setter
@Document(collection = "turn_status")
public class TurnStatus {
    @Id
    private String idTurnStatus;
    private String name;
    private String description;
    @DBRef
    @JsonIgnore
    List<Turn> turns;
}
