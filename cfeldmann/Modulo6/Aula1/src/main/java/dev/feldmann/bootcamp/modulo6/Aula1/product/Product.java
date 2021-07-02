package dev.feldmann.bootcamp.modulo6.Aula1.product;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private Long id;
    private String name;
    private Double price;
}
