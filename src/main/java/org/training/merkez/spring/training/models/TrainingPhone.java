package org.training.merkez.spring.training.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import org.training.merkez.spring.training.jpa.Employee;

@Entity
@Table(name = "training_phone")
@Getter
@Setter
public class TrainingPhone {
    @Id
    @GeneratedValue
    @Column(name = "phone_id")
    private Long phoneId;
    @NotBlank
    @Column(name = "name")
    private String name;
    @NotBlank
    @Column(name = "number")
    private String number;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private Employee employee;

}
