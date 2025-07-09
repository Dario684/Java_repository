package com.prenotaEventi.prenotaEventi.repository;



import com.prenotaEventi.prenotaEventi.model.Ruolo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Ruolo, Long> {
    Ruolo findByName(String name);
}

