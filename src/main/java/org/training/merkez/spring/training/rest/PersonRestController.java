package org.training.merkez.spring.training.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.training.merkez.spring.training.rest.model.PersonDto;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonRestController {

    public void insert(PersonDto personParam){
    }

    public void update(PersonDto personParam){
    }

    public void delete(PersonDto personParam){
    }

    public List<PersonDto> getPersons(){
        return null;
    }

}
