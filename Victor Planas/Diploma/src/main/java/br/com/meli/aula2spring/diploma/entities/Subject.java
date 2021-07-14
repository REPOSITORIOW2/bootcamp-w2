package br.com.meli.aula2spring.diploma.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Range;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

@Getter
@Setter
@Validated
@AllArgsConstructor
@NoArgsConstructor
public class Subject {
    @NotBlank(message = "subject cannot be blank")
    @Size(min = 8, max = 50)
    @Pattern(regexp = "[a-z]")
    private String subject;
    @NotNull(message = "grade cannot be null")
    @Min(message = "grade must be higher than 0", value = 0)
    @Max(message = "grade must be lower than 10", value = 10)
    private int note;
}
