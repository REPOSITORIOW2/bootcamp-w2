package com.bootcampmeli.apidiploma.services;

import com.bootcampmeli.apidiploma.entities.Degree;
import com.bootcampmeli.apidiploma.entities.Student;
import com.bootcampmeli.apidiploma.entities.SubjectGrade;

import org.springframework.stereotype.Service;

@Service
public class DegreeService {

    public DegreeService() {}

    public Degree printDegree(Student student) {
        if (student.getGrades() == null || student.getGrades().size() == 0) {
            throw new RuntimeException("O estudante não possui disciplinas! '-'");
        }

        float averageGrade = 0;
        for (SubjectGrade grade : student.getGrades()) {
            averageGrade += grade.getGrade();
        }

        averageGrade /= student.getGrades().size();
        String congratulationsMessage = averageGrade >= 9 ? "Parabéns!" : "Deveria ter estudado mais.";

        return new Degree(congratulationsMessage, averageGrade, student);
    }

    public void validarStudent(Student student) throws RuntimeException{
        for(SubjectGrade grade : student.getGrades()){
            if(grade.getGrade() < 0 || grade.getGrade() > 10){
                throw new RuntimeException("Nota inválida.");
            }
        }
    }
}