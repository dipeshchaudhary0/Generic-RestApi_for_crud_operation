package com.sunaulo_bihani.controller;

import com.sunaulo_bihani.model.BaseEntity;
import com.sunaulo_bihani.service.CommonService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


public class GenericController<E extends BaseEntity> {

    private final CommonService<E> service;

    public GenericController(CommonService<E> service) {
        this.service = service;
    }

    @PostMapping
    public Map<String, String> save(@RequestBody E entity) {
        service.save(entity);
        return Map.of("success", "success");
    }
}