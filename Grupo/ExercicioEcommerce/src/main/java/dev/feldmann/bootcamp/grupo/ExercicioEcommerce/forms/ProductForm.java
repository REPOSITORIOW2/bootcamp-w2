package dev.feldmann.bootcamp.grupo.ExercicioEcommerce.forms;


import dev.feldmann.bootcamp.grupo.ExercicioEcommerce.EnumProductCategory;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
public class ProductForm {
    private double price;
    private List<EnumProductCategory> categories;
    private String name;
}
