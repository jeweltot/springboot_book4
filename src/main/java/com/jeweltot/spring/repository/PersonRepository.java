package com.jeweltot.spring.repository;

import com.jeweltot.spring.domain.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long>
{

}
