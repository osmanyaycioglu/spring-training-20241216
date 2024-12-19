package org.training.merkez.spring.training.jpa;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.training.merkez.spring.training.models.Address;
import org.training.merkez.spring.training.models.Phone;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
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

    @OneToOne(fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    @JoinColumn(name = "address_id")
    @Fetch(FetchMode.JOIN)
    private Address address;

    @OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.ALL}, mappedBy = "employee")
    @Fetch(FetchMode.SUBSELECT)
    private Set<Phone> phones;

    private ZonedDateTime creationDate;

    private ZonedDateTime updateDate;

    @PrePersist
    public void creationDate() {
        creationDate = ZonedDateTime.now();
    }

    @PreUpdate
//    @PreRemove
//    @PostUpdate
//    @PostPersist
//    @PostRemove
//    @PostLoad
    public void updateDate() {
        updateDate = ZonedDateTime.now();
    }

}
