package com.bootcampmeli.apidiploma.services;

import com.bootcampmeli.apidiploma.dtos.DegreeDTO;
import com.bootcampmeli.apidiploma.dtos.StudentDTO;
import com.bootcampmeli.apidiploma.dtos.SubjectGradeDTO;

import org.springframework.stereotype.Service;

@Service
public class DegreeService {

    public DegreeService() {}

    public DegreeDTO printDegree(StudentDTO student) {
        if (student.getGrades() == null || student.getGrades().size() == 0) {
            throw new RuntimeException("O estudante não possui disciplinas! '-'");
        }

        float averageGrade = 0;
        for (SubjectGradeDTO grade : student.getGrades()) {
            averageGrade += grade.getGrade();
        }

        averageGrade /= student.getGrades().size();
        String congratulationsMessage = averageGrade >= 9 ? "Parabéns!" : "Deveria ter estudado mais.";

        return new DegreeDTO(congratulationsMessage, averageGrade, student);
    }
}