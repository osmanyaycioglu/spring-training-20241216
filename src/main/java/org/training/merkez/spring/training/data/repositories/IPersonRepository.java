package org.training.merkez.spring.training.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.training.merkez.spring.training.services.models.EPersonStatus;
import org.training.merkez.spring.training.services.models.Person;

import java.util.List;

public interface IPersonRepository extends JpaRepository<Person, Long> {

    Person findByPersonUuid(String personUuid);

    @Modifying
    @Query("update Person e set e.personStatus=?1 where e.personId=?2")
    void updatePersonUuid(EPersonStatus personStatusParam,Long personId);

    List<Person> findByName(String nameParam);
}

