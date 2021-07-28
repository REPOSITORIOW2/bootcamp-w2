package br.com.meli.aula2spring.integration;

import br.com.meli.aula2spring.diploma.controllers.DiplomaController;
import br.com.meli.aula2spring.diploma.dtos.DiplomaDTO;
import br.com.meli.aula2spring.diploma.dtos.StudentDTO;
import br.com.meli.aula2spring.diploma.entities.Aluno;
import br.com.meli.aula2spring.diploma.entities.Subject;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.web.servlet.MockMvc;

import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Arrays;
import java.util.List;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class DiplomaIntegrationTest {
    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper mapper;

    @Test
    public void addAluno_shouldAddAlunoToRepository() throws Exception {
        List<Subject> subjects = Arrays.asList(new Subject("matemagica", 10),new Subject("portumagica", 10));
        var alunoTeste = new Aluno("vitinhoaaaaa", subjects);
        var alunoDTO = new DiplomaDTO("Parabéns!! Sua média foi de 10.0", 10d, StudentDTO.convertToDTO(alunoTeste));
        var alunoJson = mapper.writeValueAsString(alunoTeste);
        var alunoDTOJson = mapper.writeValueAsString(alunoDTO);

        mockMvc.perform(MockMvcRequestBuilders.post("/diploma")
                .contentType("application/json")
                .content(alunoJson))
                .andExpect(status().isCreated())
                .andExpect(content().json(alunoDTOJson));
    }


}
