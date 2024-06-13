package com.sunaulo_bihani.service.impl;

import com.sunaulo_bihani.model.BaseEntity;
import com.sunaulo_bihani.repository.GeneralJpaRepository;
import com.sunaulo_bihani.service.CommonService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CommonServiceImpl<E extends BaseEntity> implements CommonService<E> {
    private final GeneralJpaRepository<E> generalJpaRepository;

    @Override
    public void save(E entity) {
        generalJpaRepository.save(entity);
    }
}