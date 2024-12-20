package org.training.merkez.spring.training.rest.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.training.merkez.spring.training.rest.model.PersonDto;
import org.training.merkez.spring.training.rest.model.PhoneDto;
import org.training.merkez.spring.training.services.models.Person;
import org.training.merkez.spring.training.services.models.Phone;

import java.util.List;

@Mapper
public interface IPersonMapper {

    IPersonMapper PERSON_MAPPER = Mappers.getMapper(IPersonMapper.class);

    Person toPerson(PersonDto person);

    PersonDto toPersonDto(Person person);

    List<Person> toPersons(List<PersonDto> person);

    List<PersonDto> toPersonDtos(List<Person> person);

    Phone toPhone(PhoneDto phone);

    PhoneDto toPhoneDto(Phone phone);

}
