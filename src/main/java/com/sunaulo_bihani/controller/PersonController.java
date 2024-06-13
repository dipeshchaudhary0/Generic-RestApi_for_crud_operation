package com.sunaulo_bihani.controller;

import com.sunaulo_bihani.model.Person;
import com.sunaulo_bihani.service.CommonService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persons")
public class PersonController extends GenericController<Person> {

    protected PersonController(CommonService<Person> service) {
        super(service);
    }
}
