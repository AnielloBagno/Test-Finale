package com.festival.service;
import com.festival.entities.Event;
import com.festival.repo.EventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {
    @Autowired
    private EventRepo eventRepo;

    public void saveEvent(Event event){
        eventRepo.save(event);
    
    }
}
