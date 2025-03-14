package com.festival.repo;
import com.festival.entities.User; 
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository <User, Long> {
    User findByEmail(String email);
}