package org.training.merkez.spring.training.rest;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import org.training.merkez.spring.training.rest.model.Person;

@RestController
@RequestMapping("/api/v1/person/provision")
public class PersonProvisionRestController {

    @PostMapping("/add")
    public void addPerson(@Valid @RequestBody Person personParam){
    }

    @GetMapping("/disable")
    public void disablePerson(@RequestParam Long personId){
    }

}
