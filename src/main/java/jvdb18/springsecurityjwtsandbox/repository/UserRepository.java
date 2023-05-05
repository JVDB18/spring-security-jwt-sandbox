package jvdb18.springsecurityjwtsandbox.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import jvdb18.springsecurityjwtsandbox.model.entity.User;


public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findByUsername(String username);

    boolean existsByUsername(String username);

}