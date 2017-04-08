package com.pgs.mapper;

import com.pgs.dto.PersonDTO;
import com.pgs.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * Created by lkuzio on 08.04.17.
 */
@Mapper(componentModel = "spring")
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mapping(source = "dateOfBirth", target="birthday")
    Person fromDTO(PersonDTO personDTO);

    @Mapping(source="birthday", target = "dateOfBirth")
    PersonDTO toDTO(Person person);

    List<PersonDTO> toDTO(List<Person> persons);

    List<Person> fromDTO(List<PersonDTO> persons);
}
