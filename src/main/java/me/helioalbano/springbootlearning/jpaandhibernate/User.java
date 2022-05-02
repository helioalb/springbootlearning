package me.helioalbano.springbootlearning.jpaandhibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.PostRemove;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;
import javax.persistence.Transient;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String userName;
    private String firstName;
    private String lastName;

    @Transient
    private String fullName;

    @PrePersist
    public void logNewUserAttempt() {
        log.info("Attempting to add new user with username: " + userName);
    }

    @PostPersist
    public void logNewUserAdded() {
        log.info("Added user '" + userName + "' with ID: " + id);
    }

    @PreRemove
    public void logUserRemovalAttempt() {
        log.info("Attempting to delete user: " + userName);
    }

    @PostRemove
    public void logUserRemoval() {
        log.info("Deleted user: " + userName);
    }

    @PreUpdate
    public void logUserUpdateAttempt() {
        log.info("Attempt to update user: " + userName);
    }

    @PostUpdate
    public void logUserUpdate() {
        log.info("Update user: " + userName);
    }

    @PostLoad
    public void logUserLoad() {
        fullName = firstName + " " + lastName;
        log.info("FullName: " + fullName);
    }
}
