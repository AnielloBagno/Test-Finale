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

public class Site {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String name;
    private String address;
    private int capacity;

    @OneToMany(mappedBy = "site")
    private List<Event> events;
}
