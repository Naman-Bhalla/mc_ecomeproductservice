package dev.naman.mc_ecomeproductservice.controllers;

import dev.naman.mc_ecomeproductservice.dtos.CreateProductRequestDto;
import dev.naman.mc_ecomeproductservice.dtos.GetProductDetailsRequestDto;
import dev.naman.mc_ecomeproductservice.models.Product;
import dev.naman.mc_ecomeproductservice.services.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // -> GET locahost:8080/products/1
    // {
    //    email:
    //    password
    // }
    @GetMapping("/products/{productId}")
    Product getProductDetails(@PathVariable("productId") Long productId,
                              @RequestBody GetProductDetailsRequestDto request) {

        Product product = productService.getProductDetails(
                productId,
                request.getEmail(),
                request.getPassword()
        );

        return product;
//        return null;
    }

    // POST localhost:8080/products
    // {
    //   product: {
    //      title:
    //      desc:
    //      price:
    //   }
    //   email:
    //   password
    // }
    @PostMapping("/products")
    Product createProduct(@RequestBody CreateProductRequestDto requestDto) {
        Product product1 = productService.createProduct(
                requestDto.getProduct(), requestDto.getEmail(), requestDto.getPassword());
        return product1;
    }
}
