package com.sunaulo_bihani.model;

import java.lang.annotation.*;
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface EnableGenericController {
    String path();
}