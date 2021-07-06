package com.bootcampmeli.ecommerceapi.services;

import java.util.List;

import com.bootcampmeli.ecommerceapi.dtos.*;
import com.bootcampmeli.ecommerceapi.entities.*;
import com.bootcampmeli.ecommerceapi.repositories.*;

import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final IProductRepository productRepository;
    private final ICategoryRepository categoryRepository;
    private final UserService userService;

    public ProductService(
            IProductRepository productRepository, 
            ICategoryRepository categoryRepository,
            UserService userService) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
        this.userService = userService;
    }
    
    public List<ProductDTO> getProducts() {
        List<Product> products = productRepository.findAll();
        return products.stream().map(p -> ProductDTO.toDTO(p)).collect(Collectors.toList());
    }

    public ProductDTO getProductById(Long productId) throws RuntimeException {
        Product product = productRepository.findById(productId).orElseThrow(() ->
            new RuntimeException("Product with id " + productId + " does not exists.")
        );
        return ProductDTO.toDTO(product);
    }

	public ProductDTO insertProduct(CreateProductDTO createProductDTO) {
        User user = this.userService.findById(createProductDTO.getUserId());
        
        if(!this.userService.hasPermission(user)) {
            throw new RuntimeException(
                "User with id " + createProductDTO.getUserId() + " does not have permission to create a new product."
            );
        }
        
        List<Category> categories = categoryRepository.findAllById(createProductDTO.getCategoryIds());
        Product product = new Product(createProductDTO.getName(), createProductDTO.getPrice(), categories);

        Product newProduct = this.productRepository.save(product);

        return ProductDTO.toDTO(newProduct);
	}

    public void deleteProduct(Long productId, UserDTO userDto) throws RuntimeException {
        User user = this.userService.findById(userDto.getId());

        if (!this.userService.hasPermission(user)) {
            throw new RuntimeException("User with id " + user.getId() + " does not have permission to delete a product.");
        }

        if(!this.productRepository.existsById(productId)) {
            throw new RuntimeException("Product with id " + productId + " does not exist.");
        }

        this.productRepository.deleteById(productId);
    }

	public ProductDTO putProduct(Long productId, UpdateProductDTO updateProductDTO) {
		User user = this.userService.findById(updateProductDTO.getUserId());
        
        if(!this.userService.hasPermission(user)) {
            throw new RuntimeException(
                "User with id " + updateProductDTO.getUserId() + " does not have permission to update a product."
            );
        }

        Product product = this.productRepository.findById(productId).orElseThrow(
            () -> new RuntimeException(
                    "Product with id " + productId + " does not exist."
            )
        );
        
        List<Category> categories = categoryRepository.findAllById(updateProductDTO.getCategoryIds());

        product.setCategories(categories);
        product.setPrice(updateProductDTO.getPrice());
        product.setName(updateProductDTO.getName());

        Product newProduct = this.productRepository.save(product);

        return ProductDTO.toDTO(newProduct);
	}

    public List<ProductDTO> getProductsByCategories(List<Long> categoryIds) {
        List<Category> categories = categoryRepository.findAllById(categoryIds);
        List<Product> products = categories.stream().flatMap(c -> c.getProducts().stream()).distinct().collect(Collectors.toList());

        return products.stream().map(p -> ProductDTO.toDTO(p)).collect(Collectors.toList());
    }
}