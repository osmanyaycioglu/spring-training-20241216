package org.training.merkez.spring.training.services.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String     name;
    private String     surname;
    private Integer    weight;
    private Integer    height;
    private String     location;
    private Set<Phone> phones;
    private Address    address;
    private ZonedDateTime createDate;
    private ZonedDateTime updateDate;
    private EPersonStatus personStatus;
    private Set<ActivityInfo> activities;
}
