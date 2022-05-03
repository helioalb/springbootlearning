package me.helioalbano.springbootlearning.jpaandhibernate;

import java.io.Serializable;

import lombok.Data;

@Data
public class PersonName implements Serializable {
    private String name;
    private String surname;
}
