package org.training.merkez.spring.training.rest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddPersonResult {
    private String description;
    private String personId;
}
