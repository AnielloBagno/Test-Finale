package com.festival.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.festival.entities.Booking;
public interface BookingRepo extends JpaRepository<Booking, Long> {
    
}
