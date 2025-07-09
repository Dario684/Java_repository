package com.prenotaEventi.prenotaEventi.controller;





import com.prenotaEventi.prenotaEventi.dto.EventDTO;
import com.prenotaEventi.prenotaEventi.model.Evento;
import com.prenotaEventi.prenotaEventi.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/events")
public class EventController {

    @Autowired
    private EventService eventService;

    @PostMapping
    public Evento createEvent(@RequestBody Evento event) {
        return eventService.saveEvent(event);
    }

    @GetMapping
    public List<EventDTO> getAllEvents() {
        return eventService.getAllEvents()
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<EventDTO> getEventById(@PathVariable Long id) {
        return eventService.getEventById(id)
                .map(event -> ResponseEntity.ok(convertToDTO(event)))
                .orElse(ResponseEntity.notFound().build());
    }

    private EventDTO convertToDTO(Evento event) {
        return new EventDTO(event.getId(), event.getTitolo(), event.getDescrizione());
    }
}
