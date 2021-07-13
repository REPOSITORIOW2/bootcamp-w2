package com.bootcampmeli.apidiploma.dtos;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class SubjectGradeDTO {
    
    @Size(min = 8, max = 50)
    @Pattern(regexp = "^[A-Za-z ]+$", message = "Nome só pode conter letras.")
    private String name;

    @Min(value = 0)
    @Max(value = 10)
    private float grade;

    public SubjectGradeDTO() { }

    public SubjectGradeDTO(String name, float grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return this.name;
    }

    public float getGrade() {
        return this.grade;
    }
}
