package com.example.mapstruct.mapper;

import com.example.mapstruct.dto.PersonDTO;
import com.example.mapstruct.entity.Person;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface PersonMapper {

    @Mappings({
            @Mapping(source = "fullName", target = "name"),
            @Mapping(source = "birthdayDate", target = "birthday", dateFormat = "MM/dd/yyyy")
    })
    PersonDTO personToPersonDto(Person person);

    @InheritInverseConfiguration
    Person personDTOToPerson(PersonDTO person);

}
