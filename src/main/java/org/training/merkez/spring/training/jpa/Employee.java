package org.training.merkez.spring.training.jpa;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue
    @Column(name = "employee_id")
    private Long employeeId;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "department")
    private String department;
}
