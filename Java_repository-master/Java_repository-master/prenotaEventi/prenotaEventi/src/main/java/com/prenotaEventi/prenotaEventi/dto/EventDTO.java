package com.prenotaEventi.prenotaEventi.dto;



public class EventDTO {
    private Long id;
    private String title;
    private String description;

    // Costruttori, Getter e Setter
    public EventDTO() {}

    public EventDTO(Long id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}
