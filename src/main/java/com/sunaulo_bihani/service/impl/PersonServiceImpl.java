package com.sunaulo_bihani.service.impl;

import com.sunaulo_bihani.repository.PersonRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl extends CommonServiceImpl {

    public PersonServiceImpl(PersonRepository personRepository) {
        super(personRepository);
    }
}
