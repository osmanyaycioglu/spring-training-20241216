package org.training.merkez.spring.training.services.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "address")
@Getter
@Setter
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
