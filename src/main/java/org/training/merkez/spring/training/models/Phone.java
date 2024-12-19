package org.training.merkez.spring.training.models;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class Phone {
    @NotBlank
    private String name;
    @NotBlank
    private String number;
}
