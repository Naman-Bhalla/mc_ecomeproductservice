package dev.naman.mc_ecomeproductservice.dtos;

import dev.naman.mc_ecomeproductservice.models.Product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateProductRequestDto {
    private Product product;
    private String email;
    private String password;
}
