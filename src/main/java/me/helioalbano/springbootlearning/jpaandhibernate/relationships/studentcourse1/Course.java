package me.helioalbano.springbootlearning.jpaandhibernate.relationships.studentcourse1;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity(name = "RCourse")
@Table(name = "courses", schema = "relationships")
@Data
public class Course {
    @Id
    Long id;

    @ManyToMany(mappedBy = "likedCourses")
    Set<Student> likes;
}
