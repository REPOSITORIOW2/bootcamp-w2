package br.com.meli.apiecommerce.repositories;

import br.com.meli.apiecommerce.dto.CategoryDTO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CategoryRepository {
    private List<CategoryDTO> categories = new ArrayList<>();

    public void add(CategoryDTO category) {
        categories.add(category);
    }

    public List<CategoryDTO> list() {
        return categories;
    }
}
