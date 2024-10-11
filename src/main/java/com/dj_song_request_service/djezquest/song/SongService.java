package com.dj_song_request_service.djezquest.song;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
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

    public List<Song> getSongs(){
        return songRepository.findAll();
    }

    public void addNewSong(Song song) {
        songRepository.save(song);
    }

}
