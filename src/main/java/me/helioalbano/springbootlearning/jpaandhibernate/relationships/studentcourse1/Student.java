package me.helioalbano.springbootlearning.jpaandhibernate.relationships.studentcourse1;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity(name = "RStudent")
@Table(name = "students", schema = "relationships")
@Data
public class Student {
    @Id
    Long id;

    @ManyToMany
    @JoinTable(name = "course_like",
        joinColumns = @JoinColumn(name = "student_id"),
        inverseJoinColumns = @JoinColumn(name = "course_id"))
    Set<Course> likedCourses;
}
