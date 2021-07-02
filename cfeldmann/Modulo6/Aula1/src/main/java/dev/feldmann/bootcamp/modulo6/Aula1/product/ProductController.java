package dev.feldmann.bootcamp.modulo6.Aula1.product;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {


    @Autowired
    private ProductService service;


    @PostMapping("/")
    public Product create(@RequestBody @Valid ProductForm product) {
        return service.create(product.getName(), product.getPrice());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> update(@PathVariable Long id, @Valid @RequestBody ProductForm produto) {
        var product = service.update(id, produto.getName(), produto.getPrice());

        if (product == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.status(HttpStatus.OK).body(product);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HashMap<String, Object>> delete(@PathVariable Long id) {
        boolean success = service.deleteById(id);

        var payloadResponse = new HashMap<String, Object>();
        payloadResponse.put("success", success);

        return new ResponseEntity<>(payloadResponse, success ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }

    @GetMapping("/")
    public List<Product> list() {
        return service.listProducts();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id) {
        var product = service.findById(id);

        if (product == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.status(HttpStatus.OK).body(product);
    }


}
