package com.sunaulo_bihani.repository;


import com.sunaulo_bihani.model.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface GeneralJpaRepository<E extends BaseEntity> extends JpaRepository<E,Long> {
}
