package com.raina.product_service.repository;

import com.raina.product_service.model.Product;
import com.raina.product_service.model.ProductResponse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,String> {


}
