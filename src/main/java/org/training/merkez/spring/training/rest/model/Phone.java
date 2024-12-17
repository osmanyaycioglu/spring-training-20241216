package org.training.merkez.spring.training.rest.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class Phone {
    @NotBlank
    private String name;
    @NotBlank
    private String number;
}
