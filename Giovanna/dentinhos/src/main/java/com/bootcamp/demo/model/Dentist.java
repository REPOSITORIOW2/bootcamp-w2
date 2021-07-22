package com.bootcamp.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.w3c.dom.css.CSSMediaRule;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="dentists")
public class Dentist {

    @Id
    @GeneratedValue
    private Long id_dentist;
    private String name;
    private String last_name;
    private String address;
    private String dni;
    private Date birth_date;
    private String phone;
    private String email;
    private String code_mp;

    @OneToMany
    @JoinColumn(name ="diary",nullable = false)
    private List<Diary> diary;

}
