package com.sunaulo_bihani.repository;


import com.sunaulo_bihani.model.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends GeneralJpaRepository<Product, Long> {

}