package me.helioalbano.springbootlearning.jpaandhibernate.relationships.studentcourse2;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity(name = "Student2")
@Table(name = "students", schema = "relationships2")
@Data
public class Student {

    @Id
    Long id;

    @OneToMany(mappedBy = "student")
    Set<CourseRating> ratings;
}
