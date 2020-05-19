package com.example.modules.domain.services;

import com.example.modules.domain.entities.Actor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ActorService {

    public Optional<Actor> getById(Integer id) {
        return Optional.of(new Actor());
    }
}
