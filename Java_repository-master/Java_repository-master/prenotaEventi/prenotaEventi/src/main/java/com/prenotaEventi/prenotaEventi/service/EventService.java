package com.prenotaEventi.prenotaEventi.service;



import com.prenotaEventi.prenotaEventi.model.Evento;
import com.prenotaEventi.prenotaEventi.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    public Evento saveEvent(Evento event) {
        return eventRepository.save(event);
    }

    public List<Evento> getAllEvents() {
        return eventRepository.findAll();
    }

    public Optional<Evento> getEventById(Long id) {
        return eventRepository.findById(id);
    }

    public void deleteEvent(Long id) {
        eventRepository.deleteById(id);
    }
}
