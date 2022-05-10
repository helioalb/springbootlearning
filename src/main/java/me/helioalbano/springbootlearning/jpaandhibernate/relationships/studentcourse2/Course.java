package me.helioalbano.springbootlearning.jpaandhibernate.relationships.studentcourse2;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "Course2")
@Table(name = "courses", schema = "relationships2")
public class Course {

    @Id
    Long id;

    @OneToMany(mappedBy = "course")
    Set<CourseRating> ratings;
}
