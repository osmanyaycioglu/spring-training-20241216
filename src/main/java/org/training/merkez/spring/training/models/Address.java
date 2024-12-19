package org.training.merkez.spring.training.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue
    @Column(name = "address_id")
    private Long addressId;
    @NotBlank
    @Column(name = "city")
    private String city;
    @NotBlank
    @Column(name = "street")
    private String street;
}
