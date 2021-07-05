package com.bootcampmeli.ecommerceapi.dtos;

import com.bootcampmeli.ecommerceapi.entities.Category;

public class CategoryDTO {

    private Long id;
    private String name;

    public CategoryDTO() {}

    public CategoryDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

	public static CategoryDTO toDTO(Category category) {
        return new CategoryDTO(category.getId(), category.getName());
	}
}
