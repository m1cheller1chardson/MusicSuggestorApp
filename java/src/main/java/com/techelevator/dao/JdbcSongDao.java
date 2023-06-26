package com.techelevator.dao;

import com.techelevator.exception.DaoException;
import com.techelevator.model.Song;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

@Component
public class JdbcSongDao implements SongDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcSongDao(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Song getSongDetailsById(int songId) {
        Song song = null;
        String sql = "SELECT * FROM song WHERE song_id = ?;";

        try {
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql, songId);
            if(results.next()){
                song = mapRowToSong(results);
            }
        } catch (CannotGetJdbcConnectionException e){
            throw new DaoException("Unable to connect to server or database.", e);
        } catch (BadSqlGrammarException e){
            throw new DaoException("SQL Syntax error.", e);
        } catch (DataIntegrityViolationException e){
            throw new DaoException("Data integrity violation", e);
        }
        return song;
    }

    @Override
    public Song getSongByGenre(String genre) {
        Song song = null;
        String sql = "SELECT * FROM song WHERE genre = ?;";

        try {
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql, genre);
            if(results.next()){
                song = mapRowToSong(results);
            }
        } catch (CannotGetJdbcConnectionException e){
            throw new DaoException("Unable to connect to server or database.", e);
        } catch (BadSqlGrammarException e){
            throw new DaoException("SQL Syntax error.", e);
        } catch (DataIntegrityViolationException e){
            throw new DaoException("Data integrity violation", e);
        }
        return song;
    }

    @Override
    public Song createSong(Song song, int songId) {
        String sql = "INSERT INTO song (artist, title, album, genre, year) " +
                "VALUES (?,?,?,?,?) RETURNING song_id";
        Song newSong = null;
        try{
            int newSongId = jdbcTemplate.queryForObject(sql, int.class, song.getArtist(), song.getTitle(), song.getAlbum(), song.getGenre(), song.getYear());
            newSong = getSongDetailsById(newSongId);
        } catch (CannotGetJdbcConnectionException e) {
            throw new DaoException("Unable to connect to server or database", e);
        } catch (BadSqlGrammarException e) {
            throw new DaoException("SQL syntax error", e);
        } catch (DataIntegrityViolationException e) {
            throw new DaoException("Data integrity violation", e);
        }
        return newSong;
    }

    @Override
    public Song updateSong(Song song, int songId) {
        Song updatedSong = new Song();
        String sql = "UPDATE song SET " +
                "artist = ?, title = ?, album = ?, genre = ?, year = ?;";
        try{
            jdbcTemplate.update(sql, song.getArtist(), song.getTitle(), song.getAlbum(), song.getGenre(), song.getYear());
        }  catch (DataAccessException e) {
            throw new DaoException("Error updating song.", e);
        }
        return updatedSong;
    }

    @Override
    public void deleteSong(int songId) {
        String sql = "DELETE FROM song WHERE song_id = ?;";
        jdbcTemplate.update(sql, songId);
    }

    private Song mapRowToSong(SqlRowSet rs){
        Song song = new Song();
        song.setSongId(rs.getInt("song_id"));
        song.setAlbum(rs.getString("artist"));
        song.setTitle(rs.getString("title"));
        song.setAlbum(rs.getString("album"));
        song.setGenre(rs.getString("genre"));
        song.setYear(rs.getInt("year"));
        return song;
    }
}
