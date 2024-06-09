package com.sunaulo_bihani.controller;


import com.sunaulo_bihani.model.Product;
import com.sunaulo_bihani.service.CommonService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/products")
public class ProductController extends GenericController<Product,Long> {

    protected ProductController(CommonService<Product,Long> service) {
        super(service);
    }
}
