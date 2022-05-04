package me.helioalbano.springbootlearning.jpaandhibernate;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class Address implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String streetAddress;
}
