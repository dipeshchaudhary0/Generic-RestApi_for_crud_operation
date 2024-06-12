package com.sunaulo_bihani.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;


@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "product")
public class Product extends BaseEntity {
    private String name;
    private String email;
}
