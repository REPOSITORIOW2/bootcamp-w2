package br.com.meli.odontology.odontology.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "turn_status")
public class TurnStatus {
    @Id
    @GeneratedValue
    private Long idTurnStatus;
    private String name;
    private String description;
    @OneToMany(mappedBy = "turnStatus")
    @JsonIgnore
    List<Turn> turns;
}
