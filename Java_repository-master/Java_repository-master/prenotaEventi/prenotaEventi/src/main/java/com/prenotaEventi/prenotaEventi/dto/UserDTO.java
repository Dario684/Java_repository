package com.prenotaEventi.prenotaEventi.dto;


import java.util.Set;

public class UserDTO {
    private Long id;
    private String username;
    private Set<String> roles;

    // Costruttori, Getter e Setter
    public UserDTO(Long id, String username, Set<Object> roles) {}

    public UserDTO(Long id, String username, Set<String> roles) {
        this.id = id;
        this.username = username;
        this.roles = roles;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public Set<String> getRoles() { return roles; }
    public void setRoles(Set<String> roles) { this.roles = roles; }
}

