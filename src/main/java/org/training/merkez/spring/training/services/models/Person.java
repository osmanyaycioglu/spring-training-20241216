package org.training.merkez.spring.training.services.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "person", indexes = {@Index(name = "person_uuid_idx", columnList = "person_uuid", unique = true)})
public class Person {
    @Id
    @GeneratedValue
    private Long              personId;
    @Column(name = "person_uuid", unique = true)
    private String            personUuid;
    private String            name;
    private String            surname;
    private Integer           weight;
    private Integer           height;
    private String            location;
    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private Set<Phone>        phones;
    @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private Address           address;
    private ZonedDateTime     createDate;
    private ZonedDateTime     updateDate;
    private EPersonStatus     personStatus;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "person")
    private Set<ActivityInfo> activities;


    @PrePersist
    public void createDate(){
        createDate = ZonedDateTime.now();
        personUuid = UUID.randomUUID().toString();
    }

    @PreUpdate
    public void updateDate(){
        updateDate = ZonedDateTime.now();
    }

}
