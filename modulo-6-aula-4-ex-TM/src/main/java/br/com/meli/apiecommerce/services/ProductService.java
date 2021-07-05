package br.com.meli.apiecommerce.services;

import br.com.meli.apiecommerce.dto.ProductDTO;
import br.com.meli.apiecommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    private int id = 1;

    public ProductDTO create(ProductDTO product) {
        product.setId(id);
        id++;

        productRepository.add(product);
        return product;
    }

    public List<ProductDTO> list() {
        return productRepository.list();
    }

    public List<ProductDTO> filterByCategory(int id) {
        return productRepository.filterByCategory(id);
    }

    public ProductDTO update(int id, ProductDTO product) {
        return productRepository.update(id, product);
    }

    public void delete(int id) {
        productRepository.delete(id);
    }
}
