package com.pgs.service;

import com.pgs.dto.PersonDTO;

import java.util.List;

/**
 * Created by lkuzio on 08.04.17.
 */
public interface PersonService {

    List<PersonDTO> findAll();

    PersonDTO findById(Long id);

    void add(PersonDTO personDTO);

    void remove(Long id);

    PersonDTO update(PersonDTO personDTO);
}
