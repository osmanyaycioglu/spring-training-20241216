package org.training.merkez.spring.training.data;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.training.merkez.spring.training.data.repositories.IPersonActivityRepository;
import org.training.merkez.spring.training.data.repositories.IPersonRepository;
import org.training.merkez.spring.training.services.models.ActivityInfo;
import org.training.merkez.spring.training.services.models.EPersonStatus;
import org.training.merkez.spring.training.services.models.Person;

import java.time.ZonedDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonDao {
    private final IPersonRepository personRepository;
    private final IPersonActivityRepository personActivityRepository;

    @Transactional(propagation = Propagation.REQUIRED)
    public Person insertPerson(Person personParam){
        Person savedLoc = personRepository.save(personParam);
        ActivityInfo activityInfoLoc = new ActivityInfo();
        activityInfoLoc.setPerson(savedLoc);
        activityInfoLoc.setActivityDate(ZonedDateTime.now());
        activityInfoLoc.setDescription("Person created");
        activityInfoLoc.setActivity(1);
        personActivityRepository.save(activityInfoLoc);
        return savedLoc;
    }

    public void updatePerson(Person personParam){
        personRepository.save(personParam);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void removePerson(String personIdParam){
        Person byPersonUuidLoc = personRepository.findByPersonUuid(personIdParam);
        if (byPersonUuidLoc != null){
            personRepository.updatePersonUuid(EPersonStatus.DISABLED,byPersonUuidLoc.getPersonId());
            ActivityInfo activityInfoLoc = new ActivityInfo();
            activityInfoLoc.setPerson(byPersonUuidLoc);
            activityInfoLoc.setActivityDate(ZonedDateTime.now());
            activityInfoLoc.setDescription("Person disabled");
            activityInfoLoc.setActivity(8);
            personActivityRepository.save(activityInfoLoc);
        }
    }

    public void activatePerson(String personIdParam){
        Person byPersonUuidLoc = personRepository.findByPersonUuid(personIdParam);
        if (byPersonUuidLoc != null){
            personRepository.updatePersonUuid(EPersonStatus.ACTIVE,byPersonUuidLoc.getPersonId());
        }
    }

    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    public List<Person> getPersonsByName(final String nameParam) {
        return personRepository.findByName(nameParam);
    }
}
