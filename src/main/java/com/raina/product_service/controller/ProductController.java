package com.raina.product_service.controller;

import com.raina.product_service.model.Product;
import com.raina.product_service.model.ProductRequest;
import com.raina.product_service.model.ProductResponse;
import com.raina.product_service.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;


    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public Product createProduct(@RequestBody ProductRequest productRequest){


       return productService.createProduct(productRequest);
    }

    @GetMapping("/get")
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllDetails(){

       return productService.getAllDetails();
    }
    @GetMapping("/get/{id}")
    public ProductResponse findById(@PathVariable String id){

        return productService.getSingleEntity(id);

    }

    public void deleteById(@PathVariable Long id){

        productService.deleteById(id);
    }






}
