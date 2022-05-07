package me.helioalbano.springbootlearning.jpaandhibernate.serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnotherUserRepository extends JpaRepository<AnotherUser, UserId> {

}
