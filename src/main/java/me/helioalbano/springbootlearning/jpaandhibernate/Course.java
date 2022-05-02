package me.helioalbano.springbootlearning.jpaandhibernate;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;

@Entity
public class Course {

    @Id
    private int id;

    @Basic(optional = false, fetch = FetchType.LAZY)
    private String name;
}
