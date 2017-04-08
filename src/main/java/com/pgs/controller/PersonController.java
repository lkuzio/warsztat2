package com.pgs.controller;

import com.pgs.dto.PersonDTO;
import com.pgs.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by lkuzio on 08.04.17.
 */
@RequestMapping(value="/persons")
@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<PersonDTO> findAll(){
        return personService.findAll();
    }

    @RequestMapping(method=RequestMethod.POST)
    public void addPerson(@Valid @RequestBody PersonDTO personDTO){
        personService.add(personDTO);
    }

    @RequestMapping(path = "/{id}",method=RequestMethod.DELETE)
    public void remove(@PathVariable Long id){
        personService.remove(id);
    }

    @RequestMapping(method=RequestMethod.PUT)
    public PersonDTO update(@Valid @RequestBody PersonDTO personDTO){
        return personService.update(personDTO);
    }

}
