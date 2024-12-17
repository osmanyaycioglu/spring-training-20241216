package org.training.merkez.spring.training.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.training.merkez.spring.training.rest.model.Person;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonRestController {

    public void insert(Person personParam){
    }

    public void update(Person personParam){
    }

    public void delete(Person personParam){
    }

    public List<Person> getPersons(){
        return null;
    }

}
