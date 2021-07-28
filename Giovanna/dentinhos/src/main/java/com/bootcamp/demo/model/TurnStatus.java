package com.bootcamp.demo.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="turn_status")
public class TurnStatus {
    @Id
    @GeneratedValue
    private Long id_turn_status;
    private String name;
    private String description;

}
