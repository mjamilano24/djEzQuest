package com.dj_song_request_service.djezquest.song;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.util.List;

@Configuration
public class SongConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            SongRepository repository) {
        return args -> {
            Song song1 = new Song(
                    1L,
                    "Supernatural",
                    "NewJeans",
                    "user@user.com",
                    LocalDateTime.now()
            );
            Song song2 = new Song(
                    "Magic Shop",
                    "BTS",
                    "marc@user.com",
                    LocalDateTime.now()
            );

            repository.saveAll(
                    List.of(song1, song2)
            );
        };
    }
}
