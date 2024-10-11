package com.dj_song_request_service.djezquest.song;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SongConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            SongRepository repository) {
        return args -> {

        };
    }
}
