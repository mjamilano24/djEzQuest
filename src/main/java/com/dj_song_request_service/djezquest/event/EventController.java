package com.dj_song_request_service.djezquest.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/event")
public class EventController {

    private final EventService eventService;

    @Autowired
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    // Get all events
    @GetMapping
    public List<Event> getEvents() {
        return eventService.getEvents();
    }

    // Create a new event for a specific user
    @PostMapping
    public Event createEvent(@RequestParam String eventName, @RequestParam Long userId, @RequestParam boolean eventStatus) {
        return eventService.createNewEvent(eventName, userId, eventStatus);
    }
}