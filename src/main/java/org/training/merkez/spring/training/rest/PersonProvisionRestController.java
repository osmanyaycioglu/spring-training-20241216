package org.training.merkez.spring.training.rest;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.training.merkez.spring.training.rest.mappers.IPersonMapper;
import org.training.merkez.spring.training.rest.model.AddPersonResult;
import org.training.merkez.spring.training.rest.model.PersonDto;
import org.training.merkez.spring.training.services.PersonProvisionService;

@RestController
@RequestMapping("/api/v1/person/provision")
@RequiredArgsConstructor
public class PersonProvisionRestController {
    private final PersonProvisionService personProvisionService;

    @PostMapping("/add")
    public AddPersonResult addPerson(@Valid @RequestBody PersonDto personParam) {
        personProvisionService.addPerson(IPersonMapper.PERSON_MAPPER.toPerson(personParam));
        return null;
    }

    @GetMapping("/disable")
    public void disablePerson(@RequestParam String personId) {
    }

    @GetMapping("/enable")
    public void enablePerson(@RequestParam String personId) {
    }

}
