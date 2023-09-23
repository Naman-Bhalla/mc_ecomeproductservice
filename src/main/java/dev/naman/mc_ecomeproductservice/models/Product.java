package dev.naman.mc_ecomeproductservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Date;

@Entity
public class Product {
    @Id
    private Long id;

    private String title;
    private String description;
    private double price;
    private Date createdAt;
    private Date lastModifiedAt;
    private int remainingQuantity;
}
