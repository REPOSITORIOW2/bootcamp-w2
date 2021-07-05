package com.bootcampmeli.ecommerceapi.dtos;

import java.math.BigDecimal;
import java.util.List;

public class UpdateProductDTO {

    private Long userId;
    private String name;
    private List<Long> categoryIds;
    private BigDecimal price;

    public UpdateProductDTO() {}

    public UpdateProductDTO(Long userId, String name, List<Long> categoryIds, BigDecimal price) {
        this.userId = userId;
        this.name = name;
        this.categoryIds = categoryIds;
        this.price = price;
    }


    public BigDecimal getPrice() {
        return price;
    }


    public List<Long> getCategoryIds() {
        return categoryIds;
    }


    public String getName() {
        return name;
    }


    public Long getUserId() {
        return userId;
    }

    
}
