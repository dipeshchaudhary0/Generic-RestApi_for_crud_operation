package com.sunaulo_bihani.service;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface CommonService<E,K> {
    E save(E entity);
    E findById(K id);
    List<E> findAll();
}