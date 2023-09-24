package dev.naman.mc_ecomeproductservice;

import dev.naman.mc_ecomeproductservice.dtos.GetProductDetailsRequestDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class McEcomeproductserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(McEcomeproductserviceApplication.class, args);
//        GetProductDetailsRequestDto requestDto = new GetProductDetailsRequestDto();
//        requestDto.getEmail();
    }

}
