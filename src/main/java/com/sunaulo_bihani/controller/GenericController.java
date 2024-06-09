package com.sunaulo_bihani.controller;

import com.sunaulo_bihani.service.CommonService;
import org.springframework.web.bind.annotation.*;
import java.util.List;


public  class GenericController<E,K> {

    private final CommonService<E,K> service;

    protected GenericController(CommonService<E,K> service) {
        this.service = service;
    }

    @PostMapping
    public E save(@RequestBody E entity) {
        return service.save(entity);
    }

    @GetMapping("/{id}")
    public E findById(@PathVariable K id) {
        return service.findById(id);
    }

    @GetMapping
    public List<E> findAll() {
        return service.findAll();
    }

}
