package br.com.meli.apiecommerce.services;

import br.com.meli.apiecommerce.dto.CategoryDTO;
import br.com.meli.apiecommerce.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    private int id = 1;

    public CategoryDTO create(CategoryDTO category) {
        category.setId(id);
        id++;

        categoryRepository.add(category);
        return category;
    }

    public List<CategoryDTO> list() {
        return categoryRepository.list();
    }
}
