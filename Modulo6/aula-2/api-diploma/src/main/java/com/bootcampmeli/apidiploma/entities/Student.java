package com.bootcampmeli.apidiploma.entities;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private List<SubjectGrade> grades = new ArrayList<>();


    public Student() {}

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, List<SubjectGrade> grades) {
        this.name = name;
        this.grades = grades;
    }

    public void addSubjectGrade(SubjectGrade subjectGrade) {
        this.grades.add(subjectGrade);
    }

    public String getName() {
        return this.name;
    }

    public List<SubjectGrade> getGrades() {
        return this.grades;
    }
}
