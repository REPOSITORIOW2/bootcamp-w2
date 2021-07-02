package com.meli.calculadoracalorias.repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.meli.calculadoracalorias.entity.Food;
import com.meli.calculadoracalorias.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductRepository {
    private static final File FILE = new File("food.json");

    @Autowired
    private ObjectMapper mapper;

    public List<Product> getList(){
        List<Product> products = new ArrayList<>();
        Map<String, List<Product>> map = new HashMap<>();
        try {
            FileInputStream is = new FileInputStream(FILE);
            TypeReference<Map<String, List<Product>>> typeReference = new TypeReference<Map<String, List<Product>>>() {};
            map = mapper.readValue(is, typeReference);
            products = map.get("products");
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return products;
    }
}
