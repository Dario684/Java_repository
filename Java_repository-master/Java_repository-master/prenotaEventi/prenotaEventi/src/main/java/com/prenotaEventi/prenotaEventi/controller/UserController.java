package com.prenotaEventi.prenotaEventi.controller;



import com.prenotaEventi.prenotaEventi.dto.UserDTO;
import com.prenotaEventi.prenotaEventi.model.User;
import com.prenotaEventi.prenotaEventi.model.Ruolo;
import com.prenotaEventi.prenotaEventi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping
    public List<UserDTO> getAllUsers() {
        return userService.getAllUsers()
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> getUserById(@PathVariable Long id) {
        return userService.getUserById(id)
                .map(user -> ResponseEntity.ok(convertToDTO(user)))
                .orElse(ResponseEntity.notFound().build());
    }

    private UserDTO convertToDTO(User user) {
        Set<Object> roles = user.getRuolo()
                .stream()
                .map(Ruolo::getNome)
                .collect(Collectors.toSet());

        return new UserDTO(user.getId(), user.getUsername(), roles);
    }
}


