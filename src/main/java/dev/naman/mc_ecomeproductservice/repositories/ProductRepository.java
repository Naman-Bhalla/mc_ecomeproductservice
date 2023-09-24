package dev.naman.mc_ecomeproductservice.repositories;

import dev.naman.mc_ecomeproductservice.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository
extends JpaRepository<Product, Long> {

    Product save(Product product);

//    Product getById(Long productId);

    @Override
    Optional<Product> findById(Long aLong);

    //    Product findByTitleEquals(String title);
}
