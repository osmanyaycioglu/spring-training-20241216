package org.training.merkez.spring.training.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.training.merkez.spring.training.data.PersonDao;
import org.training.merkez.spring.training.services.models.Person;

@Service
@RequiredArgsConstructor
public class PersonProvisionService {
    private final PersonDao personDao;

    public Person addPerson(Person personParam){
        Person personLoc = personDao.insertPerson(personParam);
        return personLoc;
    }

    public void disable(final String personIdParam) {
        personDao.removePerson(personIdParam);
    }

    public void enable(final String personIdParam) {
        personDao.activatePerson(personIdParam);
    }
}
