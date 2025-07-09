package com.prenotaEventi.prenotaEventi.dto;



public class ReservationDTO {
    private Long id;
    private Long eventId;
    private Long userId;

    // Costruttori, Getter e Setter
    public ReservationDTO() {}

    public ReservationDTO(Long id, Long eventId, Long userId) {
        this.id = id;
        this.eventId = eventId;
        this.userId = userId;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getEventId() { return eventId; }
    public void setEventId(Long eventId) { this.eventId = eventId; }

    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }
}

