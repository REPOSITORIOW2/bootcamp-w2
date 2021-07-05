package com.bootcampmeli.ecommerceapi.dtos;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;

import com.bootcampmeli.ecommerceapi.entities.Product;

public class ProductDTO {   
    
    private Long id;
    private String name;
    private List<CategoryDTO> categories = new ArrayList<>();
    private BigDecimal price;

    
    public ProductDTO() {}
    
    public ProductDTO(Long id, String name, List<CategoryDTO> categories, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.categories = categories;
        this.price = price;
    }

    public Long getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public List<CategoryDTO> getCategories() {
        return categories;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

	public static ProductDTO toDTO(Product p) {
        List<CategoryDTO> categories = p.getCategories().stream().map(c -> CategoryDTO.toDTO(c)).collect(Collectors.toList());
        return new ProductDTO(p.getId(), p.getName(), categories, p.getPrice());
	}
}
