package com.raina.product_service.service;

import com.raina.product_service.model.Product;
import com.raina.product_service.model.ProductRequest;
import com.raina.product_service.model.ProductResponse;
import com.raina.product_service.repository.ProductRepository;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository productRepository;
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public Product createProduct(ProductRequest productRequest) {
        Product product = new Product();
                product.setName(productRequest.getName());
                product.setDescription(productRequest.getDescription());
                product.setPrice(productRequest.getPrice());
                productRepository.save(product);
        return product;
    }
    public List<ProductResponse> getAllDetails() {

        List<Product> products = productRepository.findAll();
        List<ProductResponse> productRes = new ArrayList<>();

        for(Product pro : products){
            ProductResponse pr = new ProductResponse();
            pr.setId(pro.getId());
            pr.setName(pro.getName());
            pr.setDescription(pro.getDescription());
            pr.setPrice(pro.getPrice());
            productRes.add(pr);
        }

        return productRes;
    }

}
