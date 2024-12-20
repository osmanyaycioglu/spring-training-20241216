package org.training.merkez.spring.training.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.training.merkez.spring.training.services.models.ActivityInfo;

public interface IPersonActivityRepository extends JpaRepository<ActivityInfo, Long> {
}
