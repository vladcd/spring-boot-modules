package com.example.modules.repo.mapper;

import com.example.modules.domain.entities.Actor;
import com.example.modules.repo.entities.ActorEntity;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ActorEntityToActorMapper {

    public Actor toActor(ActorEntity actorEntity) {
        if (actorEntity == null) {
            return null;
        }
        Actor actor = new Actor();
        actor.setName(actorEntity.getName());
        actor.setId(actorEntity.getId());
        return actor;
    }

    public ActorEntity toActorEntity(Actor actor){
        if(actor == null){
            return null;
        }
        ActorEntity actorEntity = new ActorEntity();
        actorEntity.setName(actor.getName());
        actorEntity.setId(actor.getId());
        return actorEntity;
    }

    public Optional<Actor> toActorOptional(Optional<ActorEntity> actorOptional) {
        return Optional.ofNullable(toActor(actorOptional.orElse(null)));
    }
}
