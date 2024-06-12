package com.sunaulo_bihani.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@MappedSuperclass
@NoArgsConstructor
@Data
public class BaseEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Version
    private Integer version;

}