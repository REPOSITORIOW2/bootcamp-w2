package com.bootcampmeli.apidiploma.unit;

import com.bootcampmeli.apidiploma.controllers.DegreeController;
import com.bootcampmeli.apidiploma.dtos.DegreeDTO;
import com.bootcampmeli.apidiploma.dtos.StudentDTO;
import com.bootcampmeli.apidiploma.dtos.SubjectGradeDTO;
import com.bootcampmeli.apidiploma.services.DegreeService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = DegreeController.class)
@AutoConfigureMockMvc
@ExtendWith(SpringExtension.class)
public class DegreeControllerTest {
    
    @Autowired
    private MockMvc mvc;

    @MockBean
    private DegreeService service;
    
    @Autowired
    private ObjectMapper mapper;

    @AfterEach
    public void EXTERMINATE() {
        System.out.println("completed");
    }
    
    @Test
    @DisplayName("Should print a diploma.")
    public void testAnalyzeNotes() throws Exception {
        // given
        StudentDTO student = new StudentDTO("aaaaaaaa",
            List.of(
                new SubjectGradeDTO("aaaaaaaaa", 5.0f),
                new SubjectGradeDTO("aaaaaaaaa", 6.0f),
                new SubjectGradeDTO("aaaaaaaaa", 7.0f)
                ));

        String studentDtoJson = mapper.writeValueAsString(student);
        
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders
                .post("http://localhost:8080/analyzeNotes")
                .accept(MediaType.APPLICATION_JSON)
                .contentType(MediaType.APPLICATION_JSON)
                .content(studentDtoJson);

        // when
        DegreeDTO expectedDegree = new DegreeDTO(
            "Parabéns! ಠ_ಠ",
            6.0f,
            new StudentDTO("aaaaaaaa",
                List.of(
                    new SubjectGradeDTO("aaaaaaaaa", 5.0f),
                    new SubjectGradeDTO("aaaaaaaaa", 6.0f),
                    new SubjectGradeDTO("aaaaaaaaa", 7.0f)
                    )));
        when(service.analyzeNotes(any(StudentDTO.class))).thenReturn(expectedDegree);

        // then
        mvc.perform(request)
            .andDo(print())
            .andExpect(status().isCreated())
            .andExpect(jsonPath("$.message", is("Parabéns! ಠ_ಠ")))
            .andExpect(jsonPath("$.averageGrade").value(6.0f));
    }

    @Test
    @DisplayName("Should throw exception on Bean Validation Error.")
    public void testBeanValidation() throws Exception {
        // given
        StudentDTO student = new StudentDTO("abc",
            List.of(
                new SubjectGradeDTO("aaaaaaaaa", 7.0f)
            ));

        String studentDtoJson = mapper.writeValueAsString(student);
        
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders
                .post("http://localhost:8080/analyzeNotes")
                .accept(MediaType.APPLICATION_JSON)
                .contentType(MediaType.APPLICATION_JSON)
                .content(studentDtoJson);
        
        mvc.perform(request)
            .andDo(print())
            .andExpect(status().isBadRequest());
    }
}
