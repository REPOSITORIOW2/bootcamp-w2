package com.bootcampmeli.apidiploma.services;

import java.util.List;

import com.bootcampmeli.apidiploma.dtos.DegreeDTO;
import com.bootcampmeli.apidiploma.dtos.StudentDTO;
import com.bootcampmeli.apidiploma.dtos.SubjectGradeDTO;

import org.springframework.stereotype.Service;

@Service
public class DegreeService {

    public DegreeService() {}

    public DegreeDTO analyzeNotes(StudentDTO student) {
        if (student.getGrades() == null || student.getGrades().size() == 0) {
            throw new RuntimeException("O estudante não possui disciplinas! '-'");
        }

        float averageGrade = calculateAverage(student.getGrades());
        String congratulationsMessage = withHonors(averageGrade);

        return writeDiploma(congratulationsMessage, averageGrade, student);
    }

    public float calculateAverage(List<SubjectGradeDTO> grades) {
        float averageGrade = 0;
        for (SubjectGradeDTO grade : grades) {
            averageGrade += grade.getGrade();
        }
        averageGrade /= grades.size();
        
        return averageGrade;
    }

    public String withHonors(float averageGrade) {
        return averageGrade >= 9 ? 
            "Excepcional! Lindo e maravilhoso! Uau! Extraordinariamente fantástico!!! Exemplar! Fabuloso ( ͡° ͜ʖ ͡°)" 
            : "Parabéns! ಠ_ಠ";
    }

    public DegreeDTO writeDiploma(String congratulationsMessage, float averageGrade, StudentDTO student){
        return new DegreeDTO(congratulationsMessage, averageGrade, student);
    }
}