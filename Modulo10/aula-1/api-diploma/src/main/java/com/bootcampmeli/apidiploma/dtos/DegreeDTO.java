package com.bootcampmeli.apidiploma.dtos;

public class DegreeDTO {
    private String message;
    private float averageGrade;
    private StudentDTO student;


    public DegreeDTO(String message, float averageGrade, StudentDTO student) {
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

    public StudentDTO getStudent() {
        return this.student;
    }

    public void setStudent(StudentDTO student) {
        this.student = student;
    }

}