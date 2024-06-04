package com.sunaulo_bihani;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
@RequestMapping
public class Controller {


    @GetMapping("/message")
    private String message(){
        return "Hello World";
    }
}
