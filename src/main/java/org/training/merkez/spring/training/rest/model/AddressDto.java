package org.training.merkez.spring.training.rest.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "address")
@Getter
@Setter
public class AddressDto {
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
