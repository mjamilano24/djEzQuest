package com.dj_song_request_service.djezquest.event;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.util.List;

@Configuration
public class EventConfig {

    @Bean
    CommandLineRunner eventCommandLineRunner(EventRepository eventRepository) {
        return args -> {
        };
    }
}