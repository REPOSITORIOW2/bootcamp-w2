package dev.feldmann.bootcamp.grupo.ExercicioEcommerce.services;

import dev.feldmann.bootcamp.grupo.ExercicioEcommerce.exceptions.ItemNotFoundException;
import dev.feldmann.bootcamp.grupo.ExercicioEcommerce.forms.ProductForm;
import dev.feldmann.bootcamp.grupo.ExercicioEcommerce.models.Product;
import dev.feldmann.bootcamp.grupo.ExercicioEcommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dev.feldmann.bootcamp.grupo.ExercicioEcommerce.dto.ProductDTO;

import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public ProductDTO addProduto(ProductForm produto) {
        Product novoProduto = new Product(produto.getPrice(), produto.getCategories(), produto.getName());
        repository.save(novoProduto);
        return ProductDTO.converte(novoProduto);
    }

    public void deleteProduto(long id) {
        Optional<Product> produto = repository.getByID(id);
        if (produto.isEmpty()) {
            throw new ItemNotFoundException();
        }

        repository.remove(produto.get());

    }

    public ProductDTO getInfoProduto(long id) {
        Optional<Product> produto = repository.getByID(id);
        if (produto.isEmpty()) {
            throw new ItemNotFoundException();
        }
        return ProductDTO.converte(produto.get());
    }

    public ProductDTO updateProduto(ProductForm produto, Long idProduto) {
        Optional<Product> produtoAtt = repository.getByID(idProduto);
        if (produtoAtt.isEmpty()) throw new ItemNotFoundException();
        Product atualiza = produtoAtt.get();
        atualiza.setCategories(produto.getCategories());
        atualiza.setName(produto.getName());
        atualiza.setPrice(produto.getPrice());
        repository.save(atualiza);
        return ProductDTO.converte(atualiza);
    }
}
