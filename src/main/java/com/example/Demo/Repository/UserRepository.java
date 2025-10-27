package com.example.Demo.Repository;

import com.example.Demo.entities.Users;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Users, Long> {

    Optional<Users> findByUsername(String username);
    Optional<Users> findByEmail(String email);
    boolean existsByEmail(String email);
    boolean existsByUsername(String username);
}
