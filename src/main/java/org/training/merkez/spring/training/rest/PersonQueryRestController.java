package org.training.merkez.spring.training.rest;

import org.springframework.web.bind.annotation.*;
import org.training.merkez.spring.training.rest.model.Person;

import java.util.List;

@RestController
@RequestMapping("/api/v1/person/query")
public class PersonQueryRestController {

    @PostMapping("/get/all")
    public List<Person> getAllPerson(){
        return null;
    }


}
