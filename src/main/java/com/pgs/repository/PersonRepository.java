package com.pgs.repository;

import com.pgs.entity.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lkuzio on 08.04.17.
 */
@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {

    List<Person> findAll();

    Person findById(Long id);

    List<Person> findByFirstName(String firstName);
}
