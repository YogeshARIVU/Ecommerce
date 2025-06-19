package com.example.Ecommerce.Repo;
import com.example.Ecommerce.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByProductNameContainingIgnoreCase(String productName);
    List<Product> findByCategory(String category);
}
