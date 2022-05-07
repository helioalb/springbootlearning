package me.helioalbano.springbootlearning.jpaandhibernate.serializable;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data
public class UserId implements Serializable {
    private String name;
    private String lastName;
}
