package com.dj_song_request_service.djezquest.song;
import java.time.LocalDateTime;

public class Song {
    private Long id;
    private String title;
    private String artist;
    private String guestEmail;
    private LocalDateTime requestTimestamp;

    public Song() {
    }

    public Song(Long id, String title, String artist, String guestEmail, LocalDateTime requestTimestamp) {
        this.id = id;
        this.title = title;
        this.guestEmail = guestEmail;
        this.artist = artist;
        this.requestTimestamp = requestTimestamp;
    }

    public Song(String title, String artist, String guestEmail, LocalDateTime requestTimestamp) {
        this.title = title;
        this.artist = artist;
        this.guestEmail = guestEmail;
        this.requestTimestamp = requestTimestamp;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGuestEmail() {
        return guestEmail;
    }

    public void setGuestEmail(String guestEmail) {
        this.guestEmail = guestEmail;
    }

    public LocalDateTime getRequestTimestamp() {
        return requestTimestamp;
    }

    public void setRequestTimestamp(LocalDateTime requestTimestamp) {
        this.requestTimestamp = requestTimestamp;
    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", guestEmail='" + guestEmail + '\'' +
                ", requestTimestamp=" + requestTimestamp +
                '}';
    }
}



