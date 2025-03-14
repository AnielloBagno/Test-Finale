package com.festival.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.festival.entities.Review;
public interface ReviewRepo extends JpaRepository<Review, Long> {
    
}
