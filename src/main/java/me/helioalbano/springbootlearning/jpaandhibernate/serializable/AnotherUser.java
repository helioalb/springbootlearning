package me.helioalbano.springbootlearning.jpaandhibernate.serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class AnotherUser {
    @EmbeddedId UserId userId;
    String email;
}
