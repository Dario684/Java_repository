package com.prenotaEventi.prenotaEventi.security;



import com.prenotaEventi.prenotaEventi.model.User;
import com.prenotaEventi.prenotaEventi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("Utente non trovato"));

        return new org.springframework.security.core.userdetails.User(
                user.getUsername(),
                user.getPassword(),
                user.getRuoli().stream()
                        .map(ruolo -> new SimpleGrantedAuthority("ROLE_" + ruolo.getNome()))
                        .collect(Collectors.toList())
        );
    }
}

