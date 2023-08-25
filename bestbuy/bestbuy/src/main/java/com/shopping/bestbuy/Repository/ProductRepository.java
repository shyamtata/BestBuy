package com.shopping.bestbuy.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // Add custom queries if needed
}
