package me.helioalbano.springbootlearning.jpaandhibernate;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    void seeLogsToUnderstand() {
        User user = new User();
        user.setUserName("Helio Albano");
        user.setFirstName("Helio");
        user.setLastName("Albano");

        userRepository.save(user);

        userRepository.findByUserName("Helio Albano");

        assertTrue(true);
    }
}
