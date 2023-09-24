package dev.naman.mc_ecomeproductservice.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserServiceVerifyUserRequestDto {
    String email;
    String password;
}
