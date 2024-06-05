package com.sunaulo_bihani;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    @GetMapping("/message")
    public String message(){
        return "Hello World";
    }
    @GetMapping("/message1")
    public String message1(){
        return "Hello World1";
    }
}
