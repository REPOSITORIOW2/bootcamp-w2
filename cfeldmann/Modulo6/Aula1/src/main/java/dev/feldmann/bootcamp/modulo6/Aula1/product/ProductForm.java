package dev.feldmann.bootcamp.modulo6.Aula1.product;



import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;


@Setter
@Getter
public class ProductForm {

    @NotEmpty
    @Size(min = 3)
    private String name;

    @NotNull
    private Double price;

}
