package com.fintech.eventprocessor.application;

import com.fintech.eventprocessor.domain.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/events")
public class EventController {
    private final EventService eventService;

    @Autowired
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @PostMapping
    public Mono<Event> receiveEvent(@RequestBody Event event) {
        return eventService.processEvent(event);
    }
}