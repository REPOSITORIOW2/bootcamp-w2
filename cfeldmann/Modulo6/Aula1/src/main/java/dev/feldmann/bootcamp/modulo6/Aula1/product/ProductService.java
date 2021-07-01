package dev.feldmann.bootcamp.modulo6.Aula1.product;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class ProductService {

    private long lastId = 3232451;

    private HashMap<Long, Product> storage = new HashMap<>();


    public Product create(String nome, double preco) {

        var produtoId = lastId;
        lastId++;
        var produto = new Product(produtoId, nome, preco);
        storage.put(produtoId, produto);
        return produto;
    }

    public Product update(Long id, String name, double price) {
        var produto = findById(id);
        if (produto == null) return null;
        produto.setPrice(price);
        produto.setName(name);
        return  produto;
    }

    public Product findById(Long id) {
        return storage.get(id);
    }

    public boolean deleteById(Long id) {
        return storage.remove(id) != null;
    }

    public List<Product> listProducts(){
        return new ArrayList<>(storage.values());
    }



}
