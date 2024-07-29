package com.maxime.Car_Rentel_Spring.repository;

import com.maxime.Car_Rentel_Spring.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findFirstByEmail(String email);
}
