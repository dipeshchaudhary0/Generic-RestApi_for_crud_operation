package com.sunaulo_bihani.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;



@NoRepositoryBean
public interface GeneralJpaRepository<E,K> extends JpaRepository<E,K> {
}
