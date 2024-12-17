package org.training.merkez.spring.training.rest.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class Address {
    @NotBlank
    private String city;
    @NotBlank
    private String street;
}
