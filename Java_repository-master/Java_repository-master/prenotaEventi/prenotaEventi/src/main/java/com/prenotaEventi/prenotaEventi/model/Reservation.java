package com.prenotaEventi.prenotaEventi.model;


import com.prenotaEventi.prenotaEventi.dto.ReservationDTO;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Reservation {
    @Id @GeneratedValue
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Evento event;

    private LocalDateTime reservationDate;
    private ReservationDTO Evento;
    private ReservationDTO User;

    public Long getId() {
        return this.id;
    }

    public ReservationDTO getEvento() {
        return this.Evento;
    }

    public ReservationDTO getUser() {
        return this.User;
    }
}
