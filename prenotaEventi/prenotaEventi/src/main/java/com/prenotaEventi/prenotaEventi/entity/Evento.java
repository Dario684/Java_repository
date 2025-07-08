package com.prenotaEventi.prenotaEventi.entity;


import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Event {
    @Id @GeneratedValue
    private Long id;

    private String title;
    private String description;
    private LocalDateTime date;
    private String location;
    private int totalSeats;
    private int availableSeats;

    @OneToMany(mappedBy = "event")
    private List<Reservation> reservations;

}
