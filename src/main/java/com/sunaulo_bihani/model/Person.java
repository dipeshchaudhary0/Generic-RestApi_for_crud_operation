package com.sunaulo_bihani.model;

import jakarta.persistence.*;
import lombok.*;


@Data
@Entity
@Table(name = "person")
@EnableGenericController(path = "/person")
public class Person extends BaseEntity{
    private int age;
    private String email;
}
