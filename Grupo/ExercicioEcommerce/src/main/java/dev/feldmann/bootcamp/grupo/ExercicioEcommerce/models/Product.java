package dev.feldmann.bootcamp.grupo.ExercicioEcommerce.models;


import dev.feldmann.bootcamp.grupo.ExercicioEcommerce.EnumProductCategory;
import dev.feldmann.bootcamp.grupo.ExercicioEcommerce.utils.Ideable;
import lombok.Getter;
import lombok.Setter;


import java.util.List;

@Getter
@Setter
public class Product implements Ideable {
    private long id;
    private double price;
    private List<EnumProductCategory> categories;
    private String name;

    public Product(double price, List<EnumProductCategory> categories, String name) {
        this.price = price;
        this.categories = categories;
        this.name = name;
    }

    @Override
    public Long getID() {
        return id;
    }

    @Override
    public void setID(Long id) {
        this.id = id;
    }

    public boolean verificaCategorias(EnumProductCategory category){
        return this.categories.contains(category);
    }
}
