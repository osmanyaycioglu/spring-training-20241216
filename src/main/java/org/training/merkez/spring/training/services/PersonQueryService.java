package org.training.merkez.spring.training.services;

import org.springframework.stereotype.Service;
import org.training.merkez.spring.training.data.PersonDao;
import org.training.merkez.spring.training.services.models.Person;

import java.util.List;

@Service
public class PersonQueryService {
    private PersonDao personDao;


    public List<Person> getAllPersons(){
        return personDao.getAllPersons();
    }

    public List<Person> getPersonsByName(final String nameParam) {
        return personDao.getPersonsByName(nameParam);
    }
}
