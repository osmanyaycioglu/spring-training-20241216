package org.training.merkez.spring.training.rest;

import jakarta.persistence.Id;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.training.merkez.spring.training.rest.mappers.IPersonMapper;
import org.training.merkez.spring.training.rest.model.PersonDto;
import org.training.merkez.spring.training.services.PersonQueryService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/person/query")
@RequiredArgsConstructor
public class PersonQueryRestController {
    private final PersonQueryService queryService;

    @GetMapping("/get/all")
    public List<PersonDto> getAllPerson() {
        return IPersonMapper.PERSON_MAPPER.toPersonDtos(queryService.getAllPersons());
    }

    @GetMapping("/get/by/name")
    public List<PersonDto> getPersonsByName(@RequestParam String name) {
        return IPersonMapper.PERSON_MAPPER.toPersonDtos(queryService.getPersonsByName(name));
    }


}
