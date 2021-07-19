package br.com.meli.apiecommerce.repositories;

import br.com.meli.apiecommerce.dto.CategoryDTO;
import br.com.meli.apiecommerce.dto.ProductDTO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {
    private List<ProductDTO> products = new ArrayList<>();

    public void add(ProductDTO product) {
        products.add(product);
    }

    public List<ProductDTO> list() {
        return products;
    }

    public List<ProductDTO> filterByCategory(int id) {
        List<ProductDTO> filteredProducts = new ArrayList<>();

        for(ProductDTO product : products) {
            for(CategoryDTO category : product.getCategories()) {
                if(category.getId() == id) {
                    filteredProducts.add(product);
                    break;
                }
            }
        }

        return filteredProducts;
    }

    public ProductDTO update(int id, ProductDTO updatedProductFields) {
        ProductDTO product = findById(id);

        product.setDescription(updatedProductFields.getDescription());
        product.setPrice(updatedProductFields.getPrice());
        product.setCategories(updatedProductFields.getCategories());

        return product;
    }

    public void delete(int id) {
        ProductDTO product = findById(id);
        products.remove(product);
    }

    private ProductDTO findById(int id) {
        for(ProductDTO product : products) {
            if(product.getId() == id) return product;
        }

        return null;
    }
}
