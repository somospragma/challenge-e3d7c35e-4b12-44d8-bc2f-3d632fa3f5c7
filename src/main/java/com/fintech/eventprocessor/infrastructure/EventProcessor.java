package com.fintech.eventprocessor.infrastructure;

import com.fintech.eventprocessor.domain.Event;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class EventProcessor {
    public Mono<Event> processEvent(Event event) {
        // Simulate processing
        return Mono.just(event);
    }
}