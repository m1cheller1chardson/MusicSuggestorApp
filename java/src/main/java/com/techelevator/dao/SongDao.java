package com.techelevator.dao;

import com.techelevator.model.Song;

public interface SongDao {

    //get song details by songId
    Song getSongDetailsById(int songId);

    Song getSongByGenre(String genre);

    Song createSong(Song song, int songId);

    Song updateSong(Song song, int songId);

    void deleteSong(int songId);

}
