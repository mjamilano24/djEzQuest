package com.dj_song_request_service.djezquest.event;

import com.dj_song_request_service.djezquest.user.User;
import com.dj_song_request_service.djezquest.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class EventService {

    private final EventRepository eventRepository;
    private final UserRepository userRepository;

    @Autowired
    public EventService(EventRepository eventRepository, UserRepository userRepository) {
        this.eventRepository = eventRepository;
        this.userRepository = userRepository;
    }

    public List<Event> getEvents() {
        return eventRepository.findAll();
    }

    public Event createNewEvent(String eventName, Long userId, boolean eventStatus) {
        Optional<User> userOptional = userRepository.findById(userId);
        if (userOptional.isEmpty()) {
            throw new IllegalArgumentException("User not found with ID: " + userId);
        }
        Event event = new Event(eventName, LocalDateTime.now(), userId, eventStatus);
        return eventRepository.save(event);
    }

    // Method to find events by userId
    public List<Event> getEventsByUserId(Long userId) {
        return eventRepository.findByUserId(userId);
    }
}