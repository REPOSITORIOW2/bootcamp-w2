package br.com.meli.apiecommerce.controllers;

import br.com.meli.apiecommerce.dto.CategoryDTO;
import br.com.meli.apiecommerce.dto.OrderDTO;
import br.com.meli.apiecommerce.dto.ProductDTO;
import br.com.meli.apiecommerce.dto.UserDTO;
import br.com.meli.apiecommerce.exceptions.PermissionDeniedException;
import br.com.meli.apiecommerce.services.CategoryService;
import br.com.meli.apiecommerce.services.OrderService;
import br.com.meli.apiecommerce.services.ProductService;
import br.com.meli.apiecommerce.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EcommerceController {
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private ProductService productService;
    @Autowired
    private OrderService orderService;
    @Autowired
    private UserService userService;

    @PostMapping("/category")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public CategoryDTO createCategory(@RequestBody CategoryDTO category) {
        return categoryService.create(category);
    }

    @GetMapping("/category")
    @ResponseBody
    public List<CategoryDTO> listCategories() {
        return categoryService.list();
    }

    @PostMapping("/product")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public ProductDTO createProduct(@RequestBody ProductDTO product) {
        UserDTO user = userService.findById(product.getUserId());
        if(!user.isAdmin()) throw new PermissionDeniedException();

        return productService.create(product);
    }

    @GetMapping("/product")
    @ResponseBody
    public List<ProductDTO> listProducts() {
        return productService.list();
    }

    @PutMapping("/product/{id}")
    @ResponseBody
    public ProductDTO updatedProduct(@PathVariable int id, @RequestBody ProductDTO product) {
        UserDTO user = userService.findById(product.getUserId());
        if(!user.isAdmin()) throw new PermissionDeniedException();

        return productService.update(id, product);
    }

    @DeleteMapping("/product/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteProduct(@PathVariable int id, @RequestParam int userId) {
        UserDTO user = userService.findById(userId);
        if(!user.isAdmin()) throw new PermissionDeniedException();

        productService.delete(id);
    }

    @GetMapping("/product/category/{id}")
    @ResponseBody
    public List<ProductDTO> filterProductsByCategory(@PathVariable int id) {
        return productService.filterByCategory(id);
    }

    @PostMapping("/user")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public UserDTO createUser(@RequestBody UserDTO user) {
        return userService.create(user);
    }

    @PostMapping("/order")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public OrderDTO createOrder(@RequestBody OrderDTO order) {
        OrderDTO newOrder = orderService.create(order);
        userService.addOrder(newOrder.getUserId(), newOrder);

        return newOrder;
    }
}
