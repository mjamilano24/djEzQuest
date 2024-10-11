package com.dj_song_request_service.djezquest.song;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/song")
public class SongController {

    private final SongService songService;

    @Autowired
    public SongController(SongService songService) {
        this.songService = songService;
    }

    @GetMapping
    public List<Song> getSongs(){
        return songService.getSongs();
    }

    @PostMapping
    public void registerSong(@RequestBody Song song) {
        song.setRequestTimestamp(LocalDateTime.now());
        songService.addNewSong(song);
    }

}
