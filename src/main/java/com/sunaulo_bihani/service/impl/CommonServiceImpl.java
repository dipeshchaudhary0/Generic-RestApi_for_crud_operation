package com.sunaulo_bihani.service.impl;

import com.sunaulo_bihani.repository.GeneralJpaRepository;
import com.sunaulo_bihani.service.CommonService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;



@RequiredArgsConstructor
public  class CommonServiceImpl<E,K> implements CommonService<E,K> {

    private final GeneralJpaRepository<E,K> generalJpaRepository;

    @Override
    public E save(E entity) {
        return generalJpaRepository.save(entity);
    }

    @Override
    public E findById(K id) {
        return generalJpaRepository.findById(id).orElse(null);
    }

    @Override
    public List<E> findAll() {
        return generalJpaRepository.findAll();
    }
}