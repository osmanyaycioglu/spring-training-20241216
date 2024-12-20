package org.training.merkez.spring.training.rest;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.training.merkez.spring.training.rest.mappers.IPersonMapper;
import org.training.merkez.spring.training.rest.model.AddPersonResult;
import org.training.merkez.spring.training.rest.model.PersonDto;
import org.training.merkez.spring.training.services.PersonProvisionService;
import org.training.merkez.spring.training.services.models.Person;

@RestController
@RequestMapping("/api/v1/person/provision")
@RequiredArgsConstructor
public class PersonProvisionRestController {
    private final PersonProvisionService personProvisionService;

    @PostMapping("/add")
    public AddPersonResult addPerson(@Valid @RequestBody PersonDto personParam) {
        Person personLoc = personProvisionService.addPerson(IPersonMapper.PERSON_MAPPER.toPerson(personParam));
        return new AddPersonResult("Yeni kişi yaratıldı",
                                   personLoc.getPersonUuid());
    }

    @GetMapping("/disable")
    public String disablePerson(@RequestParam String personId) {
        personProvisionService.disable(personId);
        return "OK";
    }

    @GetMapping("/enable")
    public String enablePerson(@RequestParam String personId) {
        personProvisionService.enable(personId);
        return "OK";
    }

}
