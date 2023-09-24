package dev.naman.mc_ecomeproductservice.services;

import dev.naman.mc_ecomeproductservice.controllers.ProductController;
import dev.naman.mc_ecomeproductservice.dtos.GetProductDetailsRequestDto;
import dev.naman.mc_ecomeproductservice.dtos.UserServiceVerifyUserRequestDto;
import dev.naman.mc_ecomeproductservice.models.Product;
import dev.naman.mc_ecomeproductservice.repositories.ProductRepository;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private ProductRepository productRepository;
//    private RestTemplateBuilder restTemplateBuilder;
    private RestTemplate restTemplate;

    public ProductService(ProductRepository productRepository, RestTemplate restTemplate) {
        this.productRepository = productRepository;
        this.restTemplate = restTemplate;
//        this.restTemplateBuilder = restTemplateBuilder;
    }

    private boolean authenticate(String email, String password) {
//        RestTemplate restTemplate = restTemplateBuilder.build();

        UserServiceVerifyUserRequestDto dto = new UserServiceVerifyUserRequestDto();
        dto.setEmail(email);
        dto.setPassword(password);
//        List<String> urls = new ArrayList<>();

        ResponseEntity<Boolean> response = restTemplate.postForEntity(
                "http://userservice/users/verify",
                dto,
                Boolean.class
        );

        boolean answer = response.getBody();

        return answer;
    }

    public Product getProductDetails(Long productId, String email, String password) {
        // authenticate
        if (!authenticate(email, password)) {
            return null;
        }

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
        // authenticate
        if (!authenticate(email, password)) {
            return null;
        }

        Product savedProduct = productRepository.save(product);
        return savedProduct;
    }
}
