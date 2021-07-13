package com.bootcampmeli.apidiploma.dtos;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class StudentDTO {

    @Size(min = 8, max = 50)
    @Pattern(regexp = "^[A-Za-z ]+$", message = "Nome só pode conter letras.")
    private String name;
    
    @Valid
    private List<SubjectGradeDTO> grades = new ArrayList<>();


    public StudentDTO() {}

    public StudentDTO(String name) {
        this.name = name;
    }

    public StudentDTO(String name, List<SubjectGradeDTO> grades) {
        this.name = name;
        this.grades = grades;
    }

    public void addSubjectGrade(SubjectGradeDTO subjectGrade) {
        this.grades.add(subjectGrade);
    }

    public String getName() {
        return this.name;
    }

    public List<SubjectGradeDTO> getGrades() {
        return this.grades;
    }
}
