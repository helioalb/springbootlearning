package me.helioalbano.springbootlearning.jpaandhibernate.serializable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
public class AnotherUserTest {

    @Autowired
    private AnotherUserRepository repository;

    @Test
    void compositId() {
        UserId userId = new UserId();
        userId.setName("John");
        userId.setLastName("Doe");
        AnotherUser user = new AnotherUser();
        user.setUserId(userId);
        user.setEmail("johndoe@gmail.com");
        repository.save(user);
        assertTrue(true);
    }
}
