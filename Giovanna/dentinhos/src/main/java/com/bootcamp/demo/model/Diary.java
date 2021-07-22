package com.bootcamp.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="diarys")
public class Diary {
    @Id
    @GeneratedValue
    private Long id_diary;

    private Date start_Time;
    private Date ending_Time;
    @ManyToOne
    @JoinColumn(name ="id_dentist",nullable = false)
    private Dentist id_dentist;
}
