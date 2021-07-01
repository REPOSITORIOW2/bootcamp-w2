package com.bootcampmeli.apidiploma.entities;

public class SubjectGrade {
    
    private String name;
    private float grade;

    public SubjectGrade() { }

    public SubjectGrade(String name, float grade) {
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
