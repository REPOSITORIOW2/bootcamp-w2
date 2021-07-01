package com.bootcampmeli.apidiploma.entities;

public class Degree {
    private String message;
    private float averageGrade;
    private Student student;


    public Degree(String message, float averageGrade, Student student) {
        this.message = message;
        this.averageGrade = averageGrade;
        this.student = student;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public float getAverageGrade() {
        return this.averageGrade;
    }

    public void setAverageGrade(float averageGrade) {
        this.averageGrade = averageGrade;
    }

    public Student getStudent() {
        return this.student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

}