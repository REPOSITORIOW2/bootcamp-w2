package dev.feldmann.bootcamp.grupo.ExercicioEcommerce.dto;

import dev.feldmann.bootcamp.grupo.ExercicioEcommerce.EnumProductCategory;
import dev.feldmann.bootcamp.grupo.ExercicioEcommerce.models.Product;

import java.util.List;

public class ProductDTO {
    private long id;
    private double price;
    private List<EnumProductCategory> categories;
    private String name;


    public static ProductDTO converte(Product produto) {
        var dto = new ProductDTO();
        dto.id = produto.getID();
        dto.price = produto.getPrice();
        dto.categories = produto.getCategories();
        dto.name = produto.getName();
        return dto;
    }
}
