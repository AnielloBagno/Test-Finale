package com.festival.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

import jakarta.annotation.Generated;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class Event {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String title;
    private String description;
    private String date;
    private String time;
    private double price;

    @ManyToOne
    @JoinColumn(name="site_ID")
    private Site site;

    @OneToMany(mappedBy = "event")
    private List<Booking> bookings;

    @OneToMany(mappedBy = "event")
    private List<Review> reviews;
}
