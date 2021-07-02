package com.example.starwars.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonDTO {
    private String name;
    private String height;
    private String mass;
    private String hair_color;
    private String skin_color;
    private String eye_color;
    private String birth_year;
    private String gender;
    private String homeworlds;
    private String species;
}
