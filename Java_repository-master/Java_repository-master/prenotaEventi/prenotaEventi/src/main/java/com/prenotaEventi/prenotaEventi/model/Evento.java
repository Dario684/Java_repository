package com.prenotaEventi.prenotaEventi.model;


import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Evento {
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

    public Long getId() {
        return this.id;
    }

    public String getTitolo() {
        return this.title;
    }

    public String getDescrizione() {
        return this.description;
    }
}
