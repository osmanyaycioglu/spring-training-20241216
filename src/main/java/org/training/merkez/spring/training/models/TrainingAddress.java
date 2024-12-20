package org.training.merkez.spring.training.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "trainin_address")
@Getter
@Setter
public class TrainingAddress {
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
