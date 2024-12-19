package org.training.merkez.spring.training.rest.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

public class Phone {
    private Long phoneId;
    private String name;
    private String number;

}
