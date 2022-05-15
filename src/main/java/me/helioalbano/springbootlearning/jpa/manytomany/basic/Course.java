package me.helioalbano.springbootlearning.jpa.manytomany.basic;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Entity(name = "Course2")
@Data
public class Course {
    @Id
    private Long id;

    @ManyToMany(mappedBy = "likedCourses")
    Set<Student> likes;
}
