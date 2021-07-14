package br.com.meli.aula2spring.diploma;

import br.com.meli.aula2spring.diploma.dtos.StudentDTO;
import br.com.meli.aula2spring.diploma.entities.Aluno;
import br.com.meli.aula2spring.diploma.entities.Subject;
import br.com.meli.aula2spring.diploma.repositories.AlunoRepository;
import br.com.meli.aula2spring.diploma.service.AlunoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CertificateServiceImplTest {
    private AlunoRepository repository;
    private AlunoService service;

    @BeforeEach
    public void setupTestes(){
        this.repository = Mockito.mock(AlunoRepository.class);
        this.service = new AlunoService(repository);
    }

    @Test
    public void withHonorsMethod_shouldCongratulateWhenAverageIsHigherThanNine(){
        var result = service.withHonors(9);

        assertThat(result).isEqualTo("Parabéns!! ");
        assertThat(result).isNotEqualTo("");
    }

    @Test
    public void withHonorsMethod_shouldReturnEmptyStringWhenIsLessThanNineWithMock(){
        var result = service.withHonors(0);

        assertThat(result).isEqualTo("");
        assertThat(result).isNotEqualTo("Parabéns!! ");
    }

    @Test
    public void calculateAverage_shouldReturnZeroWhenGradeListIsEmpty(){
        var result = service.calculateAverage(new Aluno("Juquinha", new ArrayList<>()));

        assertThat(result).isEqualTo(0);
    }

    @Test
    public void calculateAverage_shouldReturnZeroWhenAllGradesAreZero(){
        List<Subject> subjects = Arrays.asList(new Subject("Matemagica", 0),new Subject("Portumagica", 0));
        var result = service.calculateAverage(new Aluno("Juquinha", subjects));

        assertThat(result).isEqualTo(0);
    }

    @Test
    public void writeDiploma_shouldCreateStudentDTOProperly(){
        List<Subject> subjects = Arrays.asList(new Subject("Matemagica", 0),new Subject("Portumagica", 0));
        var alunoTest = new Aluno("Juquinha", subjects);
        var spyService = Mockito.spy(service);
        Mockito.doReturn(0d).when(spyService).calculateAverage(alunoTest);
        Mockito.doReturn("").when(spyService).withHonors(0d);
        var result = spyService.writeDiploma(alunoTest);


        assertThat(result).hasFieldOrPropertyWithValue("message","" + "Sua média foi de " + 0.0 )
                .hasFieldOrPropertyWithValue("average", 0.0)
                .hasFieldOrProperty("student");
        assertThat(result.getStudent()).usingRecursiveComparison().isEqualTo(alunoTest);
    }
}
