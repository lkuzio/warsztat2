package com.pgs.controller;

import com.pgs.dto.PersonDTO;
import com.pgs.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
}
