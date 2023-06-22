package com.techelevator.model;

public class UserSong {

    private int userId;
    private int songId;

    public UserSong(){}
    public UserSong(int userId, int songId) {
        this.userId = userId;
        this.songId = songId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    @Override
    public String toString() {
        return "UserSong{" +
                "userId=" + userId +
                ", songId=" + songId +
                '}';
    }
}
