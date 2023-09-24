package dev.naman.mc_ecomeproductservice.dtos;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class GetProductDetailsRequestDto {
    private String email;
    private String password;

}
