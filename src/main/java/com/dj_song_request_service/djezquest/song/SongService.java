package com.dj_song_request_service.djezquest.song;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class SongService {

    private final SongRepository songRepository;

    @Autowired
    public SongService(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    // Get all songs
    public List<Song> getSongs() {
        return songRepository.findAll();
    }

    // Add a new song
    public void addNewSong(Song song) {
        // Optionally, set the request timestamp if not set in the constructor
        if (song.getRequestTimestamp() == null) {
            song.setRequestTimestamp(LocalDateTime.now());
        }
        songRepository.save(song); // JPA handles the save operation
    }
}