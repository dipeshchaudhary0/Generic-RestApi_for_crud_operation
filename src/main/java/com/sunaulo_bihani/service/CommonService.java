package com.sunaulo_bihani.service;


import com.sunaulo_bihani.model.BaseEntity;

public interface CommonService<E extends BaseEntity> {
    void save(E entity);
}