package dev.naman.mc_ecomeproductservice.services;

import dev.naman.mc_ecomeproductservice.controllers.ProductController;
import dev.naman.mc_ecomeproductservice.dtos.GetProductDetailsRequestDto;
import dev.naman.mc_ecomeproductservice.models.Product;
import dev.naman.mc_ecomeproductservice.repositories.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
public class ProductService {
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product getProductDetails(Long productId, String email, String password) {
        Optional<Product> product = productRepository.findById(productId);

        if (product.isEmpty()) {

        }
//        if (product == null) {
//
//        }
        return product.get();
    }

    public Product createProduct(Product product,
                                 String email,
                                 String password) {
        Product savedProduct = productRepository.save(product);
        return savedProduct;
    }
}
