package com.fintech.eventprocessor.application;

import com.fintech.eventprocessor.domain.Event;
import com.fintech.eventprocessor.infrastructure.EventProcessor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class EventService {
    private final EventProcessor eventProcessor;

    public EventService(EventProcessor eventProcessor) {
        this.eventProcessor = eventProcessor;
    }

    public Mono<Event> processEvent(Event event) {
        return eventProcessor.processEvent(event);
    }
}