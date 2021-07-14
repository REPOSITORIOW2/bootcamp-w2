package com.bootcampmeli.apidiploma.integration;

import com.bootcampmeli.apidiploma.dtos.StudentDTO;
import com.bootcampmeli.apidiploma.dtos.SubjectGradeDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@ExtendWith(SpringExtension.class)
public class DegreeControllerTest {

    @Autowired
    private MockMvc mock;

    @Autowired
    private ObjectMapper mapper;

    @AfterEach
    public void EXTERMINATE() {
        System.out.println("completed");
    }

    @Test
    @DisplayName("Should print a diploma.")
    public void testAnalyzeNotes() throws Exception {

        StudentDTO student = new StudentDTO("aaaaaaaa",
            List.of(
                    new SubjectGradeDTO("aaaaaaaaa", 5.0f),
                    new SubjectGradeDTO("aaaaaaaaa", 6.0f),
                    new SubjectGradeDTO("aaaaaaaaa", 7.0f)
            )
        );

        String json = mapper.writeValueAsString(student);
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders
                .post("/analyzeNotes")
                .contentType(MediaType.APPLICATION_JSON)
                .content(json);

        mock.perform(request)
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.message", is("Parabéns! ಠ_ಠ")))
                .andExpect(jsonPath("$.averageGrade").value(6.0f));
    }
}
