package com.dj_song_request_service.djezquest.event;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "events")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eventId;

    private String eventName;
    private LocalDateTime eventDate;
    private boolean eventStatus;

    // Change the user field to userId
    @Column(name = "user_id", nullable = false)
    private Long userId;

    public Event() {}

    public Event(String eventName, LocalDateTime eventDate, Long userId, boolean eventStatus) {
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.userId = userId; // Store userId instead of User object
        this.eventStatus = eventStatus;
    }

    // Getters and setters
    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public LocalDateTime getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDateTime eventDate) {
        this.eventDate = eventDate;
    }

    public boolean isEventStatus() {
        return eventStatus;
    }

    public void setEventStatus(boolean eventStatus) {
        this.eventStatus = eventStatus;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
