package me.helioalbano.springbootlearning.jpaandhibernate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
public class ItemRepositoryTest {

    @Autowired
    private ItemRepository itemRepository;

    @Test
    void shouldNotPersist() {
        // itemRepository.save(new Item());
    }
}
