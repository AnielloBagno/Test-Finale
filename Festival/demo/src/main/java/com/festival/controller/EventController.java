package com.festival.controller;
import com.festival.entities.Event;
import com.festival.repo.BookingRepo;
import com.festival.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EventController {

    private final BookingRepo bookingRepo;
    @Autowired
    private EventService eventService;

    EventController(BookingRepo bookingRepo) {
        this.bookingRepo = bookingRepo;
    }

    @GetMapping("/events")
    public String viewEvents(){
        return "events";
    }    
}
