package com.bootcampmeli.ecommerceapi.services;

import java.math.BigDecimal;
import java.util.List;

import com.bootcampmeli.ecommerceapi.entities.Admin;
import com.bootcampmeli.ecommerceapi.entities.Category;
import com.bootcampmeli.ecommerceapi.entities.Customer;
import com.bootcampmeli.ecommerceapi.entities.Order;
import com.bootcampmeli.ecommerceapi.entities.OrderItem;
import com.bootcampmeli.ecommerceapi.entities.Product;
import com.bootcampmeli.ecommerceapi.entities.User;
import com.bootcampmeli.ecommerceapi.repositories.ICategoryRepository;
import com.bootcampmeli.ecommerceapi.repositories.IOrderItemRepository;
import com.bootcampmeli.ecommerceapi.repositories.IOrderRepository;
import com.bootcampmeli.ecommerceapi.repositories.IProductRepository;
import com.bootcampmeli.ecommerceapi.repositories.IUserRepository;

import org.springframework.stereotype.Service;

@Service
public class DbService {
    private final IUserRepository userRepository;
    private final ICategoryRepository categoryRepository;
    private final IOrderItemRepository orderItemRepository;
    private final IOrderRepository orderRepository;
    private final IProductRepository productRepository;

    public DbService(
            IUserRepository userRepository, 
            ICategoryRepository categoryRepository,
            IOrderItemRepository orderItemRepository, 
            IOrderRepository orderRepository,
            IProductRepository productRepository) {
        this.userRepository = userRepository;
        this.categoryRepository = categoryRepository;
        this.orderItemRepository = orderItemRepository;
        this.orderRepository = orderRepository;
        this.productRepository = productRepository;
    }

    public void instantiateDatabase() {

        User user1 = new Customer("Galperin"),
             user2 = new Customer("Robinovich"),
             user3 = new Admin("Comernenaza");

        Order order1 = new Order(user1),
              order2 = new Order(user1),
              order3 = new Order(user2);

        user1.setOrders(List.of(order1, order2));
        user2.setOrders(List.of(order3));
         
        OrderItem orderItem1 = new OrderItem(order1, 2),
                  orderItem2 = new OrderItem(order3, 3),
                  orderItem3 = new OrderItem(order2, 1),
                  orderItem4 = new OrderItem(order1, 4),
                  orderItem5 = new OrderItem(order3, 5);

        order1.setItems(List.of(orderItem1, orderItem4));
        order2.setItems(List.of(orderItem3));
        order3.setItems(List.of(orderItem2, orderItem5));


        Product product1 = new Product("Vacuum Cleaner", List.of(orderItem1, orderItem2), new BigDecimal("189.9")),
                product2 = new Product("Chocolate Candy", List.of(orderItem3, orderItem4), new BigDecimal("2.99")),
                product3 = new Product("Bench Mixer", List.of(orderItem5), new BigDecimal("169.9"));

        productRepository.saveAll(List.of(product1, product2, product3));

        orderItem1.setProduct(product1);
        orderItem2.setProduct(product1);
        orderItem3.setProduct(product2);
        orderItem4.setProduct(product2);
        orderItem5.setProduct(product3);

        Category category1 = new Category("Cleaning", List.of(product1)),
                 category2 = new Category("Foods", List.of(product2, product3)),
                 category3 = new Category("Electronics", List.of(product1, product3));

        categoryRepository.saveAll(List.of(category1, category2, category3));
        
        product1.setCategories(List.of(category1, category3));
        product2.setCategories(List.of(category2));
        product3.setCategories(List.of(category2, category3));

        productRepository.saveAll(List.of(product1, product2, product3));

        userRepository.saveAll(List.of(user1, user2, user3));

	}
}
