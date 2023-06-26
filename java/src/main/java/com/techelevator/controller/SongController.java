package com.techelevator.controller;

import com.techelevator.dao.SongDao;
import com.techelevator.model.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.nio.file.Path;

@RestController
@CrossOrigin
@RequestMapping("/songs")
public class SongController {

    @Autowired
    private SongDao songDao;

    @GetMapping("/mySongs/{songId}")
    public Song getSongDetailsById(@PathVariable int songId){
        Song song = songDao.getSongDetailsById(songId);
        if(song == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Song not found.");
        } else {
            return song;
        }
    }

    @PostMapping("/create/{songId}")
    public Song createSong(@RequestBody Song song){
        Song newSong = songDao.createSong(song, song.getSongId());
        return newSong;
    }

    @PutMapping("/update/{songId}")
    public Song updateSong(@RequestBody Song song, @PathVariable int songId){
        Song updatedSong = songDao.updateSong(song, songId);
        if(updatedSong == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Song not found.");
        } else {
            return updatedSong;
        }
    }

    @DeleteMapping("/delete/{songId}")
    public void deleteSong(@PathVariable int songId){
        songDao.deleteSong(songId);
    }

}
