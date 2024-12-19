package org.training.merkez.spring.training.rest.model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.training.merkez.spring.training.models.Address;
import org.training.merkez.spring.training.validation.CheckNotAllowedWords;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    @NotBlank(message = "isim boş olamaz")
    @Size(min = 2, max = 20)
    @CheckNotAllowedWords(value = {"123",
                                   "abc",
                                   "qwe"
    })
    private String      name;
    @NotEmpty
    @CheckNotAllowedWords(value = {"123",
                                   "abc",
                                   "qwe"
    })
    private String      surname;
    @NotNull
    @Min(10)
    @Max(500)
    private Integer     weight;
    @Min(50)
    @Max(300)
    private Integer     height;
    @CheckNotAllowedWords(value = {"isa",
                                   "ana",
                                   "ade"
    })
    private String      location;
    @Valid
    private List<Phone> phones;
    @Valid
    private Address     address;


}
