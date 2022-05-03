package me.helioalbano.springbootlearning.jpaandhibernate;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
