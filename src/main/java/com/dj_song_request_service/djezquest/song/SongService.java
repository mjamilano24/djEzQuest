package com.dj_song_request_service.djezquest.song;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class SongService {
    public List<Song> getSongs(){
        return List.of(
                new Song(
                        1L,
                        "Supernatural",
                        "NewJeans",
                        "user@user.com",
                        LocalDateTime.now()
                )
        );
    }
}
