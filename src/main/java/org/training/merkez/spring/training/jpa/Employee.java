package org.training.merkez.spring.training.jpa;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.training.merkez.spring.training.models.Address;

@Data
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue
    @Column(name = "employee_id")
    private Long   employeeId;
    @Column(name = "name")
    @NotBlank
    private String name;
    @Column(name = "surname")
    @NotBlank
    private String surname;
    @Column(name = "department")
    @NotBlank
    private String department;

    @OneToOne(fetch = FetchType.EAGER,cascade ={CascadeType.ALL} )
    @JoinColumn(name = "address_id")
    private Address address;
}
