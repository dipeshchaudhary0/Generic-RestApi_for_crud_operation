package com.sunaulo_bihani.model;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
public @interface EnableGenericController {
    String path() default "";
}
