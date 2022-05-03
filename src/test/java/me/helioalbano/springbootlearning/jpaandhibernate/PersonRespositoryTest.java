package me.helioalbano.springbootlearning.jpaandhibernate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
public class PersonRespositoryTest {
    @Autowired
    private PersonRepository respository;
    @Test
    void save() {
        PersonName personName = new PersonName();
        personName.setName("name");
        personName.setSurname("surname");

        Person person = new Person();
        person.setPersonName(personName);

        respository.save(person);

    }
}
