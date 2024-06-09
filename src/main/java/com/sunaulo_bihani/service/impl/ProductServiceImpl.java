package com.sunaulo_bihani.service.impl;


import com.sunaulo_bihani.model.Product;
import com.sunaulo_bihani.repository.GeneralJpaRepository;
import com.sunaulo_bihani.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductServiceImpl extends CommonServiceImpl<Product,Long> {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        super(productRepository);
        this.productRepository = productRepository;
    }

}
