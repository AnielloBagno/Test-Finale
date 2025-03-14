package com.festival.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.festival.entities.Event;
public interface EventRepo extends JpaRepository<Event, Long> {
    
}
