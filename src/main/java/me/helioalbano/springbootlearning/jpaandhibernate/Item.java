package me.helioalbano.springbootlearning.jpaandhibernate;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Item {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private BigDecimal price;
}
