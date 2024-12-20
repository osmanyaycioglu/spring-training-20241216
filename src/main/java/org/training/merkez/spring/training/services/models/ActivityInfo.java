package org.training.merkez.spring.training.services.models;

import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class ActivityInfo {
    private Integer activity;
    private ZonedDateTime activityDate;
    private String description;
}
