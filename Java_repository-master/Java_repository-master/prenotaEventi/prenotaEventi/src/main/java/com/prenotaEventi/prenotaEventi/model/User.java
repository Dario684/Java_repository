package com.prenotaEventi.prenotaEventi.model;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "user")
public class User {
    @Id @GeneratedValue
    private Long id;

    private String username;
    private String email;
    private String password;

    @Enumerated(EnumType.STRING)
    private Ruolo ruolo;

    @OneToMany(mappedBy = "user")
    private List<Reservation> reservations;
    private Collection<Object> Ruolo;

    public Collection<Object> getRuolo() {
        return null;
    }

    public Long getId() {
        return this.id;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public Collection<Object> getRuoli() {
        return this.Ruolo;
    }
}
