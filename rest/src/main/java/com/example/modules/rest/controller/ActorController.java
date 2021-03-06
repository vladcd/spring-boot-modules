package com.example.modules.rest.controller;

import com.example.modules.domain.entities.Actor;
import com.example.modules.domain.services.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/actors")
public class ActorController {

    @Autowired
    private ActorService actorService;

    @GetMapping("/{id}")
    public ResponseEntity<Actor> getActor(@PathVariable Integer id) {
        return ResponseEntity.of(actorService.getById(id));
    }

    @PostMapping
    public ResponseEntity<Actor> addNewActor(@RequestBody Actor actor) {
        return ResponseEntity.ok(actorService.save(actor));
    }
}
