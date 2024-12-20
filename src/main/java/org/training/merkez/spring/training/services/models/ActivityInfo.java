package org.training.merkez.spring.training.services.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;

@Getter
@Setter
@Entity
public class ActivityInfo {
    @Id
    @GeneratedValue
    private Long aid;
    private Integer activity;
    private ZonedDateTime activityDate;
    private String description;
    @ManyToOne(fetch = FetchType.EAGER)
    private Person person;
}
