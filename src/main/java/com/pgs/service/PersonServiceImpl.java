package com.pgs.service;

import com.pgs.dto.PersonDTO;
import com.pgs.entity.Person;
import com.pgs.mapper.PersonMapper;
import com.pgs.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lkuzio on 08.04.17.
 */
@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private PersonMapper personMapper;

    public List<PersonDTO> findAll() {
        return personMapper.toDTO(personRepository.findAll());
    }

    public PersonDTO findById(Long id) {
        return personMapper.toDTO(personRepository.findById(id));
    }

    public void add(PersonDTO personDTO) {
        personRepository.save(personMapper.fromDTO(personDTO));
    }

    @Override
    public void remove(Long id) {
        personRepository.delete(id);
    }

    @Override
    public PersonDTO update(PersonDTO personDTO){
        Person updated =null;
        Person existed = personRepository.findById(personDTO.getId());
        if(existed!=null){
            updated=personRepository.save(personMapper.fromDTO(personDTO));
        }
        return personMapper.toDTO(updated);
    }
}
