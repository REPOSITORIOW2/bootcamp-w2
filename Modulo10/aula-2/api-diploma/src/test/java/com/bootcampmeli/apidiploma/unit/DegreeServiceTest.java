package com.bootcampmeli.apidiploma.unit;

import com.bootcampmeli.apidiploma.dtos.DegreeDTO;
import com.bootcampmeli.apidiploma.dtos.StudentDTO;
import com.bootcampmeli.apidiploma.dtos.SubjectGradeDTO;
import com.bootcampmeli.apidiploma.services.DegreeService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class DegreeServiceTest {

    @Autowired
    private DegreeService degreeService;

    @Test
    @DisplayName("Should create a non congratulated degree given a student with three low grades.")
    public void testAnalyzeNotes() {
        
        StudentDTO student = new StudentDTO("aaaaaaaa",
            List.of(
                new SubjectGradeDTO("abc", 5.0f),
                new SubjectGradeDTO("def", 6.0f),
                new SubjectGradeDTO("ghi", 7.0f)
            ));
        
        DegreeDTO degree = degreeService.analyzeNotes(student);

        DegreeDTO expectedDegree = new DegreeDTO(
            "Parabéns! ಠ_ಠ",
            6.0f,
            new StudentDTO());

        assertThat(degree).usingRecursiveComparison().ignoringFields("student").isEqualTo(expectedDegree);
    }

    @Test
    @DisplayName("Should calculate average given some grades.")
    public void testCalculateAverage() {
        // given list of grades
        List<SubjectGradeDTO> grades = List.of(
            new SubjectGradeDTO("a", 10.0f), 
            new SubjectGradeDTO("b", 8.0f),
            new SubjectGradeDTO("c", 9.0f));

        // when calculate grades
        float average = degreeService.calculateAverage(grades);

        // then assert result
        assertEquals(9.0, average);
    }

    @Test
    @DisplayName("Should send congratulations message with honors with average grades greater than 9.")
    public void
    testWithHonorsWithGradeGreaterThan9() {
        float averageGrade = 9.9f;

        String message = degreeService.withHonors(averageGrade);

        assertEquals(
            "Excepcional! Lindo e maravilhoso! Uau! Extraordinariamente fantástico!!! Exemplar! Fabuloso ( ͡° ͜ʖ ͡°)", 
            message);
    }

    @Test
    @DisplayName("Should send congratulations message without honors with average grades lower than 9.")
    public void testWithHonorsWithGradeLowerThan9() {
        float averageGrade = 5f;

        String congratulationsMessage = degreeService.withHonors(averageGrade);

        assertEquals("Parabéns! ಠ_ಠ", congratulationsMessage);
    }

    @Test
    @DisplayName("Should write diploma when given a congratulations message, average grade and student information.")
    public void writeDiploma() {
        // given
        StudentDTO studentDto = new StudentDTO();
        String congratulationsMessage = "Parabéns! ಠ_ಠ";
        float averageGrades = 5.0f;

        DegreeDTO degreeDto = degreeService.writeDiploma(congratulationsMessage, averageGrades, studentDto);

        DegreeDTO degreeDto2 = new DegreeDTO(
            "Parabéns! ಠ_ಠ", 
            5.0f, 
            new StudentDTO());
        
        assertThat(degreeDto).usingRecursiveComparison().isEqualTo(degreeDto2);
    }

    /*
    @Test
    @DisplayName("Should pass validation check when name and grades are given.")
    public void should_PassValidation_When_NameAndThreeOrMoreGradesGiven() {
        Long id = 1L;
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders
        .get(PLACES_API.concat("/" + id))
        .accept(MediaType.APPLICATION_JSON);

        when(degreeService.getById(id)).thenReturn(createPlaceDTO());

        mvc.perform(request)
        .andExpect(status().isOk())
        .andExpect(jsonPath("id").value(id));

        StudentDTO studentDto = new StudentDTO("Robertol", List.of(
        new SubjectGradeDTO("matematica", 8),
        new SubjectGradeDTO("portugues", 2),
        new SubjectGradeDTO("fisica quantica", 10)
        ));
    }
    */
}
